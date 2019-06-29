package com.qf.j1902.shiro.myrealm;

import com.qf.j1902.pojo.admin.AdminMenu;
import com.qf.j1902.pojo.admin.AdminUser;
import com.qf.j1902.service.AdminMenuService;
import com.qf.j1902.service.AdminUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2019/6/28 0028.
 */
//
public class MyRealm extends AuthorizingRealm{
    //注入用户业务接口
    @Autowired
    private AdminUserService adminUserService;
    //注入权限业务接口
    @Autowired
    private AdminMenuService adminMenuService;
    //授权,权限验证
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户名
        Object principal = principalCollection.getPrimaryPrincipal();
        String adminname=(String) principal;
        //根据用户名查询权限
        Set<AdminMenu> menu = adminMenuService.findAdminMenusByName(adminname);
        Set<String> menus = new HashSet<>();
        if (menu!=null){
            for (AdminMenu me:menu){
                menus.add(me.getName());
            }
        }
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setStringPermissions(menus);
        return authorizationInfo;
    }
//认证登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String adminname =(String) authenticationToken.getPrincipal();
        AdminUser user = adminUserService.findOneByName(adminname);
        SimpleAuthenticationInfo authenticationInfo=null;
        if (authenticationInfo!=null){
            authenticationInfo= new SimpleAuthenticationInfo(adminname, user.getPassword(), null, this.getName());
        }
        return authenticationInfo;
    }
}
