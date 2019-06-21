package com.neo.service.user;

import com.github.pagehelper.PageInfo;
import com.neo.model.UserDomain;

import java.util.List;


/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService {

    int addUser(UserDomain user);
    List<UserDomain> findUserById(int userId);
    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize,int userId,String userName,String sex);
    UserDomain login(int userId,String userPw);
    int updatePw(int userId,String userPw);
    int updateUser(UserDomain userDomain);
    int delete(int userId);
    int lendBook(int userId,int bookId,String opDate,String returnDate);
    int deleteInterest(int userId);
    int insertInterest(int userId,String myInterest);
}


