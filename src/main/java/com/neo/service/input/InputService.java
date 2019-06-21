package com.neo.service.input;

import com.github.pagehelper.PageInfo;
import com.neo.model.InputDomain;

public interface InputService {
    PageInfo<InputDomain> findAllAuthor(int pageNum, int pageSize);
    PageInfo<InputDomain> findAllPress(int pageNum, int pageSize);
    PageInfo<InputDomain> findAllType(int pageNum, int pageSize);
}
