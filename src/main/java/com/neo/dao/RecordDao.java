package com.neo.dao;

import com.neo.model.RecordDomain;

import java.util.List;

public interface RecordDao {
    List<RecordDomain> selectRecords(int userId,String userName,int bookId,
                                     String bookName,String operation,String date1,String date2);
    List<RecordDomain> selectRank(String date1,String date2);
    List<RecordDomain> selectTypeByYear();
    List<RecordDomain> selectComments(int bookId);
    int addComment(int bookId,int userId,String opDate,String content);
    List<RecordDomain> selectRecordByUser(int userId,int bookId,
                                     String bookName,String operation,String date1,String date2);
    int checkClick(int userId,int bookId);
    int updateClick(int userId,int bookId);
    int insertClick(int userId,int bookId);
}
