package com.neo.dao;

import com.neo.model.BookDomain;

import java.util.List;

public interface BookDao{
    int insert(BookDomain book);
    List<BookDomain> selectBooks(int bookId,String bookName,String author,
                                       String press,String bookType,String date1,String date2);
    List<BookDomain> selectBooksByLend(int bookId,String bookName,String author,
                                 String press,String bookType,String date1,String date2);
    List<BookDomain> selectBooksByComment(int bookId,String bookName,String author,
                                 String press,String bookType,String date1,String date2);
    List<BookDomain> selectBooksByTime(int bookId,String bookName,String author,
                                 String press,String bookType,String date1,String date2);
    BookDomain selectBookById(int bookId);
    int update(BookDomain book);
    int delete(int bookId);
    int check(int bookId);
    List<BookDomain> selectTypes();
    List<BookDomain> selectBookByUser(int userId);
}
