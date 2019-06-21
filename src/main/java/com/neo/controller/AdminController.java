package com.neo.controller;

import com.neo.model.AdminDomain;
import com.neo.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @ResponseBody
    @PostMapping("/add")
    public int addAdmin(AdminDomain admin){
        return adminService.addAdmin(admin);
    }
    @ResponseBody
    @GetMapping("/all")
    public Object findAllAdmin(
            @RequestParam(name = "page", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "limit", required = false, defaultValue = "10")
                    int pageSize,int adminId,String adminName,String sex,String role){
        System.out.println(adminId+" "+adminName+" "+sex+" "+role);
        if (!adminName.equals("#")) adminName="%"+adminName+"%";
        return adminService.findAllAdmin(pageNum,pageSize,adminId,adminName,sex,role);
    }
    @ResponseBody
    @GetMapping("/find")
    public Object findAdminById(int adminId){
        return adminService.findAdminById(adminId);
    }
    @ResponseBody
    @PostMapping("/update")
    public String updateAdmin(String role,int adminId,String adminName,String sex,String photo,String phone,String email,String remark
    ,HttpServletRequest httpServletRequest){
        AdminDomain admin=new AdminDomain();
        admin.setAdminId(adminId);
        admin.setAdminName(adminName);
        admin.setRole(role);
        admin.setPhone(phone);
        admin.setSex(sex);
        admin.setPhoto(photo);
        admin.setEmail(email);
        admin.setRemark(remark);
        int ans=adminService.updateAdmin(admin);
        System.out.println(admin.getRole());
        System.out.println(admin.getAdminName());
        System.out.println(admin.getAdminId());
        if(ans>0){
            HttpSession session = httpServletRequest.getSession();
            session.setAttribute("myId",admin.getAdminId());
            session.setAttribute("myName",admin.getAdminName());
            session.setAttribute("myPhoto",admin.getPhoto());
            return "OK";
        }
        else return "FAIL";
    }
    @ResponseBody
    @PostMapping("/login")
    public String login(int adminId, String adminPw,HttpServletRequest httpServletRequest){
        AdminDomain admin=adminService.login(adminId,adminPw);
        if(admin==null){
            return "FAIL";
        }
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("myId",admin.getAdminId());
        session.setAttribute("myRole",admin.getRole().equals("超级管理员")?1:0);
        session.setAttribute("myName",admin.getAdminName());
        session.setAttribute("myPhoto",admin.getPhoto());
        return "OK";
    }
    @ResponseBody
    @PostMapping("/password")
    public String edit_pass(int adminId,String oldPw,String newPw){
        AdminDomain admin=adminService.login(adminId,oldPw);
        if(admin!=null&&adminService.updatePw(adminId,newPw)>0){
            return "OK";
        }
        return "FAIL";
    }
    @ResponseBody
    @PostMapping("/updateUser")
    public int updateUser(int userId,String userName,String sex,String phone,String email){
        return adminService.updateUser(userId, userName, sex, phone, email);
    }

}
