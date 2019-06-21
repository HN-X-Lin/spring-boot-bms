package com.neo.service.record.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neo.dao.RecordDao;
import com.neo.service.record.RecordService;
import com.neo.model.RecordDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "recordService")
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordDao recordDao;
    @Override
    public PageInfo<RecordDomain> findAllRecord(int pageNum, int pageSize,int userId,String userName,int bookId,
                                                String bookName,String operation,String date1,String date2) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<RecordDomain> RecordDomains = recordDao.selectRecords(userId,userName,bookId,bookName,
                operation,date1,date2);
        PageInfo result = new PageInfo(RecordDomains);
        return result;
    }
    @Override
    public PageInfo<RecordDomain> findByRank(int pageNum, int pageSize,String date1,String date2) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<RecordDomain> RecordDomains = recordDao.selectRank(date1,date2);
        PageInfo result = new PageInfo(RecordDomains);
        return result;
    }
    @Override
    public List<RecordDomain> findTypeByYear() {
        return recordDao.selectTypeByYear();
    }
    @Override
    public PageInfo<RecordDomain> findAllComment(int pageNum, int pageSize,int bookId){
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<RecordDomain> RecordDomains = recordDao.selectComments(bookId);
        PageInfo result = new PageInfo(RecordDomains);
        return result;
    }
    @Override
    public PageInfo<RecordDomain> findAllRecordByUser(int pageNum, int pageSize,int userId,int bookId,
                                                String bookName,String operation,String date1,String date2) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<RecordDomain> RecordDomains = recordDao.selectRecordByUser(userId,bookId,bookName,
                operation,date1,date2);
        PageInfo result = new PageInfo(RecordDomains);
        return result;
    }
    @Override
    public int addComment(int bookId,int userId,String opDate,String content){
        return recordDao.addComment(bookId,userId, opDate, content);
    }
    @Override
    public int checkClick(int userId,int bookId){
        return recordDao.checkClick(userId, bookId);
    }
    @Override
    public int updateClick(int userId,int bookId){
        return recordDao.updateClick(userId, bookId);
    }
    @Override
    public int insertClick(int userId,int bookId){
        return recordDao.insertClick(userId, bookId);
    }
}
