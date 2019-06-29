package com.qf.j1902.controller;

import com.qf.j1902.pojo.admin.AdminMenu;
import com.qf.j1902.pojo.admin.AdminRole;
import com.qf.j1902.pojo.admin.AdminUser;
import com.qf.j1902.service.AdminMenuService;
import com.qf.j1902.service.AdminRoleService;
import com.qf.j1902.service.AdminUserService;
import com.qf.j1902.shiro.utils.ImgCode;
import com.qf.j1902.shiro.utils.MD5;
import com.qf.j1902.shiro.utils.SessionKey;
import com.qf.j1902.vo.LoginVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2019/6/28 0028.
 */
@Controller
public class LoginRegController {
    @Autowired
    private AdminUserService adminUserService;
    @Autowired
    private AdminMenuService adminMenuService;
    @Autowired
    private AdminRoleService adminRoleService;
    //显示登录视图
    @RequestMapping("/")
    public String loginView(){
        return "login";
    }
    //登录处理
    @RequestMapping(value = "deallogin",method = RequestMethod.POST)
    public String dealLogin(LoginVo loginVo,HttpSession session){
        String verify =(String) session.getAttribute(ImgCode.RANDOMCODEKEY);
        if (StringUtils.startsWithIgnoreCase(verify,loginVo.getVerrifyCode())){
              try {
                        //从安全管理器获取主体对象
                        Subject subject = SecurityUtils.getSubject();
                        //构建令牌
                        UsernamePasswordToken token = new UsernamePasswordToken(loginVo.getLoginName(), loginVo.getPassword());
                        //登录
                        subject.login(token);
                        if (subject.isAuthenticated()) {
                            session.setAttribute(SessionKey.ADMINUSERNAME,loginVo.getLoginName());
                            Set<AdminMenu> menus = adminMenuService.findAdminMenusByUserName(loginVo.getLoginName());
                            session.setAttribute(SessionKey.ADMINUSERMENUS,menus);
                            List<AdminRole> roles = adminRoleService.findAdminRolesByUserName(loginVo.getLoginName());
                            session.setAttribute(SessionKey.ADMINROLE,roles);
                            return "/main";//如果登录成功返回的页面
                        }
                    }catch (AuthenticationException e){
                        e.printStackTrace();
                    }
        }else {
            return "redirect:/";//验证码无效
        }


        return "redirect:/";//未登录成功返回的页面
    }



    //验证码换图
    @RequestMapping(value ="/getimage",method = RequestMethod.GET)
    public void getVerifyImg(HttpServletRequest request, HttpServletResponse response){
        ImgCode imgCode = new ImgCode();
        imgCode.getRandcode(request,response);
    }



    //    显示unauth视图
    @RequestMapping("/unauth")
    public String showUnauthView(){
        return "unauth";
    }
    //注销用户
    @RequestMapping("/logout")
    public String logOut(){
        try {
            Subject subject = SecurityUtils.getSubject();
            subject.logout();//退出操作（清除用户缓存数据）

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }
}
