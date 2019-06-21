package com.neo.controller;

import com.neo.model.UserDomain;
import com.neo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by useristrator on 2017/8/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
    @ResponseBody
    @PostMapping("/add")
    public int addUser(UserDomain user){
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "page", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "limit", required = false, defaultValue = "10")
                    int pageSize,
            int userId,String userName,String sex){
        System.out.println(userId+" "+userName+" "+sex);
        if(!userName.equals("#")) userName="%"+userName+"%";
        return userService.findAllUser(pageNum,pageSize,userId,userName,sex);
    }
    @ResponseBody
    @GetMapping("/find")
    public Object findUserById(int userId){
        Object object=userService.findUserById(userId);
        System.out.println(object);
        return userService.findUserById(userId);
    }
    @ResponseBody
    @PostMapping("/login")
    public String login(int userId, String userPw, HttpServletRequest httpServletRequest){
        System.out.println(userId);
        UserDomain user=userService.login(userId,userPw);
        if(user==null){
            return "FAIL";
        }
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("userId",user.getUserId());
        session.setAttribute("userName",user.getUserName());
        session.setAttribute("userPhoto",user.getPhoto());
        return "OK";
    }
    @ResponseBody
    @PostMapping("/password")
    public String edit_pass(int userId,String oldPw,String newPw){
        UserDomain user=userService.login(userId,oldPw);
        if(user!=null&&userService.updatePw(userId,newPw)>0){
            return "OK";
        }
        return "FAIL";
    }
    @ResponseBody
    @PostMapping("/update")
    public String updateUser(int userId,String userName,String sex,String photo,String phone,String email
            ,HttpServletRequest req){
        String[] array = req.getParameterValues("array[]");
        UserDomain user=new UserDomain();
        user.setUserId(userId);
        user.setUserName(userName);
        user.setPhone(phone);
        user.setSex(sex);
        user.setPhoto(photo);
        user.setEmail(email);
        int ans=userService.updateUser(user);
        if(ans>0){
            int ans2=userService.deleteInterest(userId);
            if(ans2>0){
                for(int i=0;i<array.length;i++) userService.insertInterest(userId,array[i]);
                HttpSession session = req.getSession();
                session.setAttribute("userId",user.getUserId());
                session.setAttribute("userName",user.getUserName());
                session.setAttribute("userPhoto",user.getPhoto());
                return "OK";
            }
        }
        return "FAIL";
    }
    @ResponseBody
    @PostMapping("/delete")
    public int delete(int userId){
        return userService.delete(userId);
    }
    @ResponseBody
    @PostMapping("/lend")
    public int lend(int userId,int bookId){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        Date date=calendar.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String returnDate=sdf.format(date);
        String opDate=sdf.format(new Date());
        System.out.println(userId+" "+bookId+" "+opDate+" "+returnDate);
        return userService.lendBook(userId,bookId,opDate,returnDate);
    }
}


