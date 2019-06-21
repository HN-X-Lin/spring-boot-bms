package com.neo.dao;

import com.neo.model.InputDomain;

import java.util.List;

public interface InputDao {
    List<InputDomain> selectAuthors();
    List<InputDomain> selectPresss();
    List<InputDomain> selectTypes();
}
