package com.neo.service.input.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neo.service.input.InputService;
import com.neo.model.InputDomain;
import org.springframework.beans.factory.annotation.Autowired;
import com.neo.dao.InputDao;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "inputService")
public class InputServiceImpl implements InputService {
    @Autowired
    private InputDao inputDao;//这里会报错，但是并不会影响
    @Override
    public PageInfo<InputDomain> findAllAuthor(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<InputDomain> InputDomains = inputDao.selectAuthors();
        PageInfo result = new PageInfo(InputDomains);
        return result;
    }

    @Override
    public PageInfo<InputDomain> findAllPress(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<InputDomain> InputDomains = inputDao.selectPresss();
        PageInfo result = new PageInfo(InputDomains);
        return result;
    }

    @Override
    public PageInfo<InputDomain> findAllType(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<InputDomain> InputDomains = inputDao.selectTypes();
        PageInfo result = new PageInfo(InputDomains);
        return result;
    }
}
