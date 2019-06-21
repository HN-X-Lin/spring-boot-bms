package com.neo.service.record;

import com.github.pagehelper.PageInfo;
import com.neo.model.RecordDomain;

import java.util.List;

public interface RecordService {
    PageInfo<RecordDomain> findAllRecord(int pageNum, int pageSize,int userId,String userName,int bookId,
                                         String bookName,String operation,String date1,String date2);
    PageInfo<RecordDomain> findByRank(int pageNum, int pageSize,String date1,String date2);

    List<RecordDomain> findTypeByYear();
    PageInfo<RecordDomain> findAllComment(int pageNum, int pageSize,int bookId);
    PageInfo<RecordDomain> findAllRecordByUser(int pageNum, int pageSize,int userId,int bookId,
                                         String bookName,String operation,String date1,String date2);
    int addComment(int bookId,int userId,String opDate,String content);
    int checkClick(int userId,int bookId);
    int updateClick(int userId,int bookId);
    int insertClick(int userId,int bookId);
}
