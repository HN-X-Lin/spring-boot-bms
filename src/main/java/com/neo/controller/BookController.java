package com.neo.controller;

import com.neo.model.BookDomain;
import com.neo.model.SearchDomain;
import com.neo.service.book.BookService;
import com.neo.service.search.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private SearchService searchService;
    @ResponseBody
    @PostMapping("/add")
    String addBook(String _bookId,String _bookName,String _author,String _press,String _bookDate,String _bookType,String _bookDesc,String _bookImage){
        BookDomain book=new BookDomain();
        book.setBookId(Integer.valueOf(_bookId));
        book.setAuthor(_author);
        book.setBookDate(_bookDate);
        book.setBookDesc(_bookDesc);
        book.setBookType(_bookType);
        book.setPhoto(_bookImage);
        book.setBookName(_bookName);
        book.setPress(_press);
        int ans=bookService.addBook(book);
        if(ans>0){
            SearchDomain esBook=new SearchDomain();
            esBook.setBookId(Integer.valueOf(_bookId));
            esBook.setAuthor(_author);
            esBook.setBookDate(_bookDate);
            esBook.setBookDesc(_bookDesc);
            esBook.setBookType(_bookType);
            esBook.setPhoto(_bookImage);
            esBook.setBookName(_bookName);
            esBook.setPress(_press);
            searchService.save(esBook);
            return "OK";
        }
        return "FAIL";
    }
    @ResponseBody
    @GetMapping("/all")
    public Object findAllBook(
            @RequestParam(name = "page", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "limit", required = false, defaultValue = "10")
                    int pageSize,
            Integer bookId,String bookName,String author,String press,String bookType,String date1,String date2){
        if(!bookName.equals("#")) bookName="%"+bookName+"%";
        System.out.println(bookId+" "+bookName+" "+author+" "+press+" "+bookType+" "+date1+" "+date2);
//        searchService.delete(0);
//        PageInfo<BookDomain> object=bookService.findAllBook(0,100,0,"#","#","#","#","#","#");
//        List<BookDomain> list=object.getList();
//        for(int i=0;i<list.size();i++){
//            BookDomain bookDomain=list.get(i);
//            SearchDomain esBook=new SearchDomain();
//            esBook.setBookId(Integer.valueOf(bookDomain.getBookId()));
//            esBook.setAuthor(bookDomain.getAuthor());
//            esBook.setBookDate(bookDomain.getBookDate());
//            esBook.setBookDesc(bookDomain.getBookDesc());
//            esBook.setBookType(bookDomain.getBookType());
//            esBook.setPhoto(bookDomain.getPhoto());
//            esBook.setBookName(bookDomain.getBookName());
//            esBook.setPress(bookDomain.getPress());
//            esBook.setCnt(bookDomain.getCnt());
//            searchService.save(esBook);
//        }
        return bookService.findAllBook(pageNum,pageSize,bookId,bookName,author,press,bookType,date1,date2);
    }
    @ResponseBody
    @GetMapping("/sort")
    public Object findAllBookSort(
            @RequestParam(name = "page", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "limit", required = false, defaultValue = "10")
                    int pageSize,
            Integer bookId,String bookName,String author,String press,String bookType,String date1,String date2,String it){
        if(!bookName.equals("#")) bookName="%"+bookName+"%";
        if(it.equals("借阅量")) return bookService.findBooksByLend(pageNum,pageSize,bookId,bookName,author,press,bookType,date1,date2);
        else if(it.equals("评论数")) return bookService.findBooksByComment(pageNum,pageSize,bookId,bookName,author,press,bookType,date1,date2);
        return bookService.findBooksByTime(pageNum,pageSize,bookId,bookName,author,press,bookType,date1,date2);
    }
    @ResponseBody
    @GetMapping("/recommend")
    public Object findAllBookByUser(
            @RequestParam(name = "page", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "limit", required = false, defaultValue = "10")
                    int pageSize,int userId){
        return bookService.findBookByUser(pageNum,pageSize,userId);
    }
    @ResponseBody
    @GetMapping("/type")
    public Object findAllType(){
        return bookService.findAllType();
    }
    @ResponseBody
    @GetMapping("/find")
    public Object findBookById(int bookId){
        return bookService.findBookById(bookId);
    }

    @ResponseBody
    @PostMapping("/delete")
    public int deleteBook(int bookId){
        int ans=bookService.deleteBook(bookId);
        if(ans>0){
            searchService.delete(bookId);
        }
        return ans;
    }
    @ResponseBody
    @PostMapping("/check")
    public int checkBookById(HttpServletRequest req){
        String[] array = req.getParameterValues("array[]");
        System.out.println(array.toString());
        int len=array.length;
        for (String string : array) {
            int key=Integer.valueOf(string);
            if(bookService.checkBookById(key)<1) return 0;
        }
        for (String string : array) {
            int key=Integer.valueOf(string);
            bookService.deleteBook(key);
        }
        return 1;
    }
    @ResponseBody
    @PostMapping("/update")
    public String updateBook(String _bookId,String _bookName,String _author,String _press,String _bookDate,String _bookType,String _bookDesc,String _bookImage){
        BookDomain book=new BookDomain();
        book.setBookId(Integer.valueOf(_bookId));
        book.setAuthor(_author);
        book.setBookDate(_bookDate);
        book.setBookDesc(_bookDesc);
        book.setBookType(_bookType);
        book.setPhoto(_bookImage);
        book.setBookName(_bookName);
        book.setPress(_press);
        int ans=bookService.updateBook(book);
        if(ans>0){
            SearchDomain esBook=new SearchDomain();
            esBook.setBookId(Integer.valueOf(_bookId));
            esBook.setAuthor(_author);
            esBook.setBookDate(_bookDate);
            esBook.setBookDesc(_bookDesc);
            esBook.setBookType(_bookType);
            esBook.setPhoto(_bookImage);
            esBook.setBookName(_bookName);
            esBook.setPress(_press);
            searchService.delete(Integer.valueOf(_bookId));
            searchService.save(esBook);
            return "OK";
        }
        return "FAIL";
    }
}
