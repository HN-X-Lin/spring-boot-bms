package com.neo.service.user.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neo.dao.UserDao;
import com.neo.model.UserDomain;
import com.neo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/16.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;//这里会报错，但是并不会影响

    @Override
    public int addUser(UserDomain user) {

        return userDao.insert(user);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public PageInfo<UserDomain> findAllUser(int pageNum, int pageSize,int userId,String userName,String sex) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserDomain> userDomains = userDao.selectUsers(userId,userName,sex);
        PageInfo result = new PageInfo(userDomains);
        return result;
    }
    @Override
    public List<UserDomain> findUserById(int userId){
        return userDao.selectUserById(userId);
    }
    @Override
    public UserDomain login(int userId,String userPw){
        return userDao.login(userId,userPw);
    }
    @Override
    public int updatePw(int userId,String userPw){
        return userDao.updatePw(userId,userPw);
    }
    @Override
    public int updateUser(UserDomain userDomain){
        return userDao.update(userDomain);
    }
    @Override
    public int delete(int userId){
        return userDao.delete(userId);
    }
    @Override
    public int lendBook(int userId,int bookId,String opDate,String returnDate){
        return userDao.lend(userId, bookId, opDate, returnDate);
    }
    @Override
    public int deleteInterest(int userId){
        return userDao.deleteInterest(userId);
    }
    @Override
    public int insertInterest(int userId,String myInterest){
        return userDao.insertInterest(userId,myInterest);
    }
}


