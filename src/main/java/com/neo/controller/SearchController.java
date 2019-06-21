package com.neo.controller;

import com.neo.model.SearchDomain;
import com.neo.service.search.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/search")
public class SearchController {

    @Autowired
    private SearchService searchService;
    @ResponseBody
    @GetMapping("/all")
    public Page<SearchDomain> search(@RequestParam(name = "page", required = false, defaultValue = "1")
                                 int pageNum,
                         @RequestParam(name = "limit", required = false, defaultValue = "10")
                                 int pageSize){
        Pageable pageable=PageRequest.of(pageNum-1,pageSize);
        Page<SearchDomain> books=searchService.findAll(pageable);
        return books;
    }
    @ResponseBody
    @PostMapping("/save")
    public void save(SearchDomain searchDomain){
        searchService.save(searchDomain);
    }
    @ResponseBody
    @GetMapping("/es")
    public Object search(@RequestParam(name = "page", required = false, defaultValue = "1")
                                             int pageNum,
                                     @RequestParam(name = "limit", required = false, defaultValue = "10")
                                             int pageSize, String key){
        System.out.println(key);
//        Pageable pageable=PageRequest.of(pageNum-1,pageSize);
//        BoolQueryBuilder boolQueryBuilder= QueryBuilders.boolQuery();
//        boolQueryBuilder.filter(QueryBuilders.multiMatchQuery(key,"bookName","author","press","bookType"));
//        HighlightBuilder highlightBuilder=new HighlightBuilder();
//        highlightBuilder.preTags("<span style='color:red'>");
//        highlightBuilder.postTags("</span>");
//        highlightBuilder.field("bookName");
//        highlightBuilder.field("author");
//        highlightBuilder.field("press");
//        // 创建搜索 DSL 查询
//        SearchQuery searchQuery = new NativeSearchQueryBuilder()
//                .withPageable(pageable)
//                .withQuery(boolQueryBuilder)
//                .withHighlightFields(new HighlightBuilder.Field("bookName").preTags("<span style='color:red'>").postTags("</span>"))
//                .build();
        return searchService.search(pageNum, pageSize, key);
    }
}
