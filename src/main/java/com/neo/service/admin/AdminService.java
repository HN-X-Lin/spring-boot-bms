package com.neo.service.admin;

import com.github.pagehelper.PageInfo;
import com.neo.model.AdminDomain;

public interface AdminService {
    int addAdmin(AdminDomain admin);
    PageInfo<AdminDomain> findAllAdmin(int pageNum, int pageSize,int adminId,String adminName,String sex,String role);
    AdminDomain findAdminById(int adminId);
    int updateAdmin(AdminDomain admin);
    AdminDomain login(int adminId,String adminPw);
    int updatePw(int adminId,String adminPw);
    int updateUser(int userId,String userName,String sex,String phone,String email);
}
