package com.neo.dao;


import com.neo.model.UserDomain;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);
    List<UserDomain> selectUserById(int userId);
    List<UserDomain> selectUsers(int userId,String userName,String sex);
    UserDomain login(int userId,String userPw);
    int updatePw(int userId,String userPw);
    int update(UserDomain userDomain);
    int delete(int userId);//管理员删除用户
    int lend(int userId,int bookId,String opDate,String returnDate);
    int deleteInterest(int userId);
    int insertInterest(int userId,String myInterest);
}
