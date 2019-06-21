package com.neo.service.book;
import com.github.pagehelper.PageInfo;
import com.neo.model.BookDomain;

import java.util.List;

public interface BookService {
    int addBook(BookDomain book);
    PageInfo<BookDomain> findAllBook(int pageNum, int pageSize,int bookId,String bookName,String author,String press,String bookType,String date1,String date2);
    int deleteBook(int bookId);
    int updateBook(BookDomain book);
    BookDomain findBookById(int bookId);
    int checkBookById(int bookId);
    List<BookDomain> findAllType();
    PageInfo<BookDomain> findBookByUser(int pageNum, int pageSize,int userId);
    PageInfo<BookDomain> findBooksByLend(int pageNum, int pageSize,int bookId,String bookName,String author,
                                       String press,String bookType,String date1,String date2);
    PageInfo<BookDomain> findBooksByComment(int pageNum, int pageSize,int bookId,String bookName,String author,
                                          String press,String bookType,String date1,String date2);
    PageInfo<BookDomain> findBooksByTime(int pageNum, int pageSize,int bookId,String bookName,String author,
                                       String press,String bookType,String date1,String date2);
}
