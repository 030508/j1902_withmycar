package com.qf.j1902.controller;

import com.qf.j1902.vo.LoginVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2019/6/28 0028.
 */
@Controller
public class LoginRegController {
    //显示登录视图
    @RequestMapping("/")
    public String loginView(){
        return "login";
    }
    //登录处理
    @RequestMapping(value = "dealLogin",method = RequestMethod.POST)
    public String dealLogin(LoginVo loginVo){
        try {
            //从安全管理器获取主体对象
            Subject subject = SecurityUtils.getSubject();
            //构建令牌
            UsernamePasswordToken token = new UsernamePasswordToken(loginVo.getLoginName(), loginVo.getPassword());
            //登录
            subject.login(token);
            if (subject.isAuthenticated()) {
                return "#";//如果登录成功返回的页面
            }
        }catch (AuthenticationException e){
            e.printStackTrace();
        }

        return "#";//未登录成功返回的页面
    }

}
