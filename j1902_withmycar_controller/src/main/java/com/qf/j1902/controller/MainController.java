package com.qf.j1902.controller;

import com.qf.j1902.pojo.admin.AdminUser;
import com.qf.j1902.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.ApplicationScope;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/authc")
public class MainController {
    @Autowired
    private AdminUserService adminUserService;


    @RequestMapping("/main")
    public String getMain(){
        return "main";
    }@RequestMapping("/logon")
    public String logon(){

        return "logon";
    }

    @RequestMapping("/personalCenter")
    public  String personalCenter(HttpSession session, Model model){
        AdminUser adminUser = adminUserService.findOneByName((String) session.getAttribute("adminUserName"));
        model.addAttribute("adminUser",adminUser);
        return "personalCenter";
    }


}
