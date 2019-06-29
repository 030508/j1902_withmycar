package com.qf.j1902.service;

import com.qf.j1902.pojo.admin.AdminUser;
import com.qf.j1902.pojo.utils.PageBean;

import java.util.List;

public interface AdminUserService {

   //分页查询
   PageBean<AdminUser> findPageBean(Integer currentPage,Integer pageSize);

   //通过用户名查询
   AdminUser findOneByName(String username);


   //通过用户名进行删除
   void deleteOneByName(String username);

   //添加新管理员用户
   void addByAdminUser(AdminUser adminUser);

   //修改管理员邮箱电话信息
   void updetaOneByName(String phone,String email,String username);

   //管理员用户修改密码
   void updetaPasswordByName(String password,String username);

   //修改管理员用户状态信息
   void updatestatusByName(Integer status,String username);
}
