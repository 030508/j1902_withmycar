package com.qf.j1902.mapper;

import com.qf.j1902.pojo.admin.AdminMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminMenuMapper {
    List<AdminMenu>  findAll();  //查询所有菜单（权限列表）
    List<AdminMenu> findAdminMenusByUserName(String username);//查询用户所拥有的权限

    void addAdminMenu(@Param("adminMenu") AdminMenu adminMenu); //添加菜单（权限信息）
    void updateStatusById(Integer status,Integer id); //修改菜单状态（权限状态）


}
