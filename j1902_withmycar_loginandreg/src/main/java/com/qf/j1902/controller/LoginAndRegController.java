package com.qf.j1902.controller;

import com.qf.j1902.pojo.admin.AdminRole;
import com.qf.j1902.service.AdminUserService;
import com.qf.j1902.utils.ImgCode;
import com.qf.j1902.utils.KeySession;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class LoginAndRegController {

    @Autowired
    private AdminUserService adminUserService;

    @RequestMapping("/login")  //登录
    public String login(String name , String password , String authCode , HttpSession session, Model model){
        String attribute = (String) session.getAttribute(ImgCode.RANDOMCODEKEY); //获取session 中的验证码
        if (StringUtils.startsWithIgnoreCase(attribute,authCode)){//进行验证码比较
            Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken();
         try {
             subject.login(token);
             if (subject.isAuthenticated()){
                session.setAttribute(KeySession.USERNAME,name);  //设置session 用户名
                 return "/login";
             }
         } catch (AuthenticationException e) {
             model.addAttribute("log","用户名或密码错误");
             return "/login";
         }

        }else {
            model.addAttribute("log","验证码错误");
            return "/login";
        }
    }
    @RequestMapping("/loginView")  //显示验证码图片试图
    public String loginView(){
        return "/login";
    }
    @RequestMapping("/getImage")
    public void getViewImage(HttpServletRequest request, HttpServletResponse response){
        ImgCode imgCode = new ImgCode(); //创建一个 随机验证码图片
        imgCode.getRandcode(request,response); //放到ImgCode工具类属性中（工具类在放到session中）
    }
}
