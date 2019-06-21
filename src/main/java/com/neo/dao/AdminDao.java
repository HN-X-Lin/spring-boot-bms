package com.neo.dao;

import com.neo.model.AdminDomain;

import java.util.List;

public interface AdminDao {
    int insert(AdminDomain record);
    List<AdminDomain> selectAdmins(int adminId,String adminName,String sex,String role);
    AdminDomain selectAdminById(int adminId);
    int update(AdminDomain record);
    AdminDomain login(int adminId,String adminPw);
    int updatePw(int adminId,String adminPw);
    int updateUser(int userId,String userName,String sex,String phone,String email);
}
