package com.qf.j1902.mapper;

import com.qf.j1902.pojo.admin.AdminUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminUserMapper {
    List<AdminUser> findAll(@Param("startIndex") Integer startIndex,@Param("endIndex") Integer endIndex); //查询所有用户
    AdminUser findOneByName(String username);//根据用户名查询
    void deleteOneByName(String username);//根据用户名删除用户
    void updetaOneByName(@Param("phone") String phone,@Param("email") String email,@Param("username") String username);
    void updetaPasswordByName(@Param("password") String password,@Param("username") String username); //修改密码
    void addByAdminUser(@Param("adminUser") AdminUser adminUser);//添加AdminUser

    void updatestatusByName(Integer status, String username); //修改用户状态


    Integer findAllCount();   //查询总记录数


}
