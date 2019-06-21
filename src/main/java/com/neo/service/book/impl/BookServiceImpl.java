package com.neo.service.book.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neo.dao.BookDao;
import com.neo.model.BookDomain;
import com.neo.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;//这里会报错，但是并不会影响
    @Override
    public int addBook(BookDomain book){
        return bookDao.insert(book);
    }
    @Override
    public PageInfo<BookDomain> findAllBook(int pageNum, int pageSize,int bookId,String bookName,String author,String press,String bookType,String date1,String date2) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<BookDomain> bookDomains = bookDao.selectBooks(bookId,bookName,author,press,bookType,date1,date2);
        PageInfo result = new PageInfo(bookDomains);
        return result;
    }
    @Override
    public PageInfo<BookDomain> findBookByUser(int pageNum, int pageSize,int userId) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<BookDomain> bookDomains = bookDao.selectBookByUser(userId);
        PageInfo result = new PageInfo(bookDomains);
        return result;
    }
    @Override
    public int deleteBook(int bookId){
        return bookDao.delete(bookId);
    }
    @Override
    public int updateBook(BookDomain book){
        return bookDao.update(book);
    }
    @Override
    public BookDomain findBookById(int bookId){
        return bookDao.selectBookById(bookId);
    }
    @Override
    public int checkBookById(int bookId){
        return bookDao.check(bookId);
    }
    @Override
    public List<BookDomain> findAllType(){
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        List<BookDomain> bookDomains = bookDao.selectTypes();
        return bookDomains;
    }
    @Override
    public PageInfo<BookDomain> findBooksByLend(int pageNum, int pageSize,int bookId,String bookName,String author,String press,String bookType,String date1,String date2) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<BookDomain> bookDomains = bookDao.selectBooksByLend(bookId,bookName,author,press,bookType,date1,date2);
        PageInfo result = new PageInfo(bookDomains);
        return result;
    }
    @Override
    public PageInfo<BookDomain> findBooksByComment(int pageNum, int pageSize,int bookId,String bookName,String author,String press,String bookType,String date1,String date2) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<BookDomain> bookDomains = bookDao.selectBooksByComment(bookId,bookName,author,press,bookType,date1,date2);
        PageInfo result = new PageInfo(bookDomains);
        return result;
    }
    @Override
    public PageInfo<BookDomain> findBooksByTime(int pageNum, int pageSize,int bookId,String bookName,String author,String press,String bookType,String date1,String date2) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<BookDomain> bookDomains = bookDao.selectBooksByTime(bookId,bookName,author,press,bookType,date1,date2);
        PageInfo result = new PageInfo(bookDomains);
        return result;
    }

}
