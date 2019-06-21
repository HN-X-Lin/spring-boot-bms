package com.neo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Controller
public class IndexController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping("/userLogin")
    public String userLogin() {
        return "userLogin";
    }
    @RequestMapping("/reader")
    public String reader(HttpServletRequest httpServletRequest,ModelMap modelMap) {
        HttpSession session = httpServletRequest.getSession();
        System.out.println(session.getAttribute("myId"));
        if(session.getAttribute("myId")==null) return "login";
        modelMap.addAttribute("myId",session.getAttribute("myId"));
        modelMap.addAttribute("myRole",session.getAttribute("myRole"));
        modelMap.addAttribute("myName",session.getAttribute("myName"));
        modelMap.addAttribute("myPhoto",session.getAttribute("myPhoto"));
        return "reader";
    }
    @RequestMapping("/manager")
    public String manager(HttpServletRequest httpServletRequest,ModelMap modelMap) {
        HttpSession session = httpServletRequest.getSession();
        System.out.println(session.getAttribute("myId"));
        if(session.getAttribute("myId")==null) return "login";
        modelMap.addAttribute("myId",session.getAttribute("myId"));
        modelMap.addAttribute("myRole",session.getAttribute("myRole"));
        modelMap.addAttribute("myName",session.getAttribute("myName"));
        modelMap.addAttribute("myPhoto",session.getAttribute("myPhoto"));
        return "manager";
    }
    @RequestMapping("/bookManage")
    public String bookManage(HttpServletRequest httpServletRequest,ModelMap modelMap) {
        HttpSession session = httpServletRequest.getSession();
        if(session.getAttribute("myId")==null) return "login";
        modelMap.addAttribute("myId",session.getAttribute("myId"));
        modelMap.addAttribute("myRole",session.getAttribute("myRole"));
        modelMap.addAttribute("myName",session.getAttribute("myName"));
        modelMap.addAttribute("myPhoto",session.getAttribute("myPhoto"));
        return "bookManage";
    }
    @RequestMapping("/record")
    public String record(HttpServletRequest httpServletRequest,ModelMap modelMap) {
        HttpSession session = httpServletRequest.getSession();
        if(session.getAttribute("myId")==null) return "login";
        modelMap.addAttribute("myId",session.getAttribute("myId"));
        modelMap.addAttribute("myRole",session.getAttribute("myRole"));
        modelMap.addAttribute("myName",session.getAttribute("myName"));
        modelMap.addAttribute("myPhoto",session.getAttribute("myPhoto"));
        return "record";
    }
    @RequestMapping("/bookAnalysis")
    public String bookAnalysis(HttpServletRequest httpServletRequest,ModelMap modelMap) {
        HttpSession session = httpServletRequest.getSession();
        if(session.getAttribute("myId")==null) return "login";
        modelMap.addAttribute("myId",session.getAttribute("myId"));
        modelMap.addAttribute("myRole",session.getAttribute("myRole"));
        modelMap.addAttribute("myName",session.getAttribute("myName"));
        modelMap.addAttribute("myPhoto",session.getAttribute("myPhoto"));
        return "bookAnalysis";
    }
    @RequestMapping("/logout")
    public String logout(HttpServletRequest httpServletRequest){
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("myId",null);
        session.setAttribute("myRole",null);
        session.setAttribute("myName",null);
        session.setAttribute("myPhoto",null);
        return "login";
    }
    @RequestMapping("/index")
    public String dashboard(HttpServletRequest httpServletRequest,ModelMap modelMap) {
        HttpSession session = httpServletRequest.getSession();
        System.out.println(session.getAttribute("myId"));
        if(session.getAttribute("myId")==null) return "login";
        modelMap.addAttribute("myId",session.getAttribute("myId"));
        modelMap.addAttribute("myRole",session.getAttribute("myRole"));
        modelMap.addAttribute("myName",session.getAttribute("myName"));
        modelMap.addAttribute("myPhoto",session.getAttribute("myPhoto"));
        return "index";
    }
    @RequestMapping("/userIndex")
    public String userIndex(HttpServletRequest httpServletRequest,ModelMap modelMap){
        HttpSession session = httpServletRequest.getSession();
        if(session.getAttribute("userId")==null) return "userLogin";
        modelMap.addAttribute("userId",session.getAttribute("userId"));
        modelMap.addAttribute("userName",session.getAttribute("userName"));
        modelMap.addAttribute("userPhoto",session.getAttribute("userPhoto"));
        return "userIndex";
    }
    @RequestMapping("/userRecord")
    public String userRecord(HttpServletRequest httpServletRequest,ModelMap modelMap){
        HttpSession session = httpServletRequest.getSession();
        if(session.getAttribute("userId")==null) return "userLogin";
        modelMap.addAttribute("userId",session.getAttribute("userId"));
        modelMap.addAttribute("userName",session.getAttribute("userName"));
        modelMap.addAttribute("userPhoto",session.getAttribute("userPhoto"));
        return "userRecord";
    }
    @RequestMapping("/userLogout")
    public String userlogout(HttpServletRequest httpServletRequest){
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("userId",null);
        session.setAttribute("userName",null);
        session.setAttribute("userPhoto",null);
        return "userLogin";
    }
    @RequestMapping("/comment")
    public String comment(HttpServletRequest httpServletRequest,ModelMap modelMap){
        HttpSession session = httpServletRequest.getSession();
        if(session.getAttribute("userId")==null) return "userLogin";
        modelMap.addAttribute("userId",session.getAttribute("userId"));
        modelMap.addAttribute("userName",session.getAttribute("userName"));
        modelMap.addAttribute("userPhoto",session.getAttribute("userPhoto"));
        return "comment";
    }
    @RequestMapping("/recommend")
    public String recommend(HttpServletRequest httpServletRequest,ModelMap modelMap){
        HttpSession session = httpServletRequest.getSession();
        if(session.getAttribute("userId")==null) return "userLogin";
        modelMap.addAttribute("userId",session.getAttribute("userId"));
        modelMap.addAttribute("userName",session.getAttribute("userName"));
        modelMap.addAttribute("userPhoto",session.getAttribute("userPhoto"));
        return "recommend";
    }
    @RequestMapping("/elasticsearch")
    public String elasticsearch(HttpServletRequest httpServletRequest,ModelMap modelMap){
        HttpSession session = httpServletRequest.getSession();
        if(session.getAttribute("userId")==null) return "userLogin";
        modelMap.addAttribute("userId",session.getAttribute("userId"));
        modelMap.addAttribute("userName",session.getAttribute("userName"));
        modelMap.addAttribute("userPhoto",session.getAttribute("userPhoto"));
        return "elasticsearch";
    }
}