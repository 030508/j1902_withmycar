package com.qf.j1902.mapper;

import com.qf.j1902.pojo.admin.AdminUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminUserMapper {
    List<AdminUser> findAll(); //查询所有用户
    AdminUser findOneByName(String username);//根据用户名查询
    void deleteOneByName(String username);//根据用户名删除用户
    void updetaOneByName(@Param("phone") String phone,@Param("email") String email,@Param("username") String username);
    void addByAdminUser(AdminUser adminUser);//添加AdminUser

}
