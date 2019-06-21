package com.neo.controller;

import com.neo.model.SearchDomain;
import com.neo.service.record.RecordService;
import com.neo.service.search.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Controller
@RequestMapping(value = "/record")
public class RecordController {
    @Autowired
    private RecordService recordService;
    @Autowired
    private SearchService searchService;
    @ResponseBody
    @GetMapping("/user")
    public Object findAllRecordByUser(
            @RequestParam(name = "page", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "limit", required = false, defaultValue = "10")
                    int pageSize,
            Integer userId,Integer bookId,
            String bookName,String operation,String date1,String date2){
        if(!bookName.equals("#")) bookName="%"+bookName+"%";
        return recordService.findAllRecordByUser(pageNum,pageSize,
                userId,bookId,bookName,operation,date1,date2);
    }
    @ResponseBody
    @GetMapping("/all")
    public Object findAllRecord(
            @RequestParam(name = "page", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "limit", required = false, defaultValue = "10")
                    int pageSize,
            Integer userId,String userName,Integer bookId,
            String bookName,String operation,String date1,String date2){
        if (!userName.equals("#")) userName="%"+userName+"%";
        if(!bookName.equals("#")) bookName="%"+bookName+"%";
        return recordService.findAllRecord(pageNum,pageSize,
                userId,userName,bookId,bookName,operation,date1,date2);
    }
    @ResponseBody
    @GetMapping("/rank")
    public Object findByRank(
            @RequestParam(name = "page", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "limit", required = false, defaultValue = "10")
                    int pageSize, String date1,String date2){
        System.out.println(date1+"  "+date2);
        return recordService.findByRank(pageNum,pageSize, date1,date2);
    }
    @ResponseBody
    @GetMapping("/year")
    public Object findTypeByYear(
            @RequestParam(name = "page", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "limit", required = false, defaultValue = "10")
                    int pageSize){
        return recordService.findTypeByYear();
    }
    @ResponseBody
    @GetMapping("/comment")
    public Object findAllComment(
            @RequestParam(name = "page", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "limit", required = false, defaultValue = "10")
                    int pageSize,int bookId){
        System.out.println(pageNum+"  "+pageSize);
        return recordService.findAllComment(pageNum,pageSize,bookId);
    }
    @ResponseBody
    @PostMapping("/add")
    public int addComment(int bookId,int userId,String content){
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String opDate=sdf.format(date);
        System.out.println(userId+" "+bookId+" "+" "+content);
        int ans=recordService.addComment( bookId,userId,opDate, content);
        if(ans>0){
            Optional<SearchDomain> searchDomain=searchService.findById(bookId);
            int oldCnt=0;
            if(searchDomain.isPresent()){
                searchService.delete(bookId);
                oldCnt=searchDomain.get().getCnt();
            }
            searchDomain.get().setCnt(oldCnt+1);
            searchService.save(searchDomain.get());
        }
        return ans;
    }
    @ResponseBody
    @PostMapping("/click")
    public int click(int userId,int bookId){
        int ans=recordService.checkClick(userId, bookId);
        if(ans>0) return recordService.updateClick(userId, bookId);
        return recordService.insertClick(userId, bookId);
    }
}
