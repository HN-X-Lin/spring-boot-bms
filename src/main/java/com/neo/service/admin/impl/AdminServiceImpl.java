package com.neo.service.admin.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neo.dao.AdminDao;
import com.neo.model.AdminDomain;
import com.neo.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/16.
 */
@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;//这里会报错，但是并不会影响

    @Override
    public int addAdmin(AdminDomain admin) {

        return adminDao.insert(admin);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public PageInfo<AdminDomain> findAllAdmin(int pageNum, int pageSize,
                                              int adminId,String adminName,String sex,String role) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<AdminDomain> adminDomains = adminDao.selectAdmins(adminId,adminName,sex,role);
        PageInfo result = new PageInfo(adminDomains);
        return result;
    }
    @Override
    public AdminDomain findAdminById(int adminId){
        return adminDao.selectAdminById(adminId);
    }
    @Override
    public int updateAdmin(AdminDomain admin){
        return adminDao.update(admin);
    }
    @Override
    public AdminDomain login(int adminId,String adminPw){
        AdminDomain admin=adminDao.login(adminId,adminPw);
        if(admin!=null){
            return adminDao.selectAdminById(adminId);
        }
        return null;
    }
    @Override
    public int updatePw(int adminId,String adminPw){
        return adminDao.updatePw(adminId,adminPw);
    }
    @Override
    public int updateUser(int userId,String userName,String sex,String phone,String email){
        return adminDao.updateUser(userId, userName, sex, phone, email);
    }
}


