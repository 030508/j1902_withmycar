package com.qf.j1902.service;

import com.qf.j1902.pojo.admin.AdminMenu;

import java.util.List;
import java.util.Set;


/**
 * Created by Administrator on 2019/6/28 0028.
 */

public interface AdminMenuService {
    List<AdminMenu> findAll();  //查询所有菜单（权限列表）
    Set<AdminMenu> findAdminMenusByUserName(String username);//查询用户所拥有的权限

    void addAdminMenu(AdminMenu adminMenu); //添加菜单（权限信息）
    void updateStatusById(Integer status,Integer id); //修改菜单状态（权限状态）

}
