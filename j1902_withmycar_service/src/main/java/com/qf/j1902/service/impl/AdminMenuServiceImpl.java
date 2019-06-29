package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.AdminMenuMapper;
import com.qf.j1902.pojo.admin.AdminMenu;
import com.qf.j1902.service.AdminMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
public class AdminMenuServiceImpl implements AdminMenuService {
    @Resource
    private AdminMenuMapper adminMenuMapper;
    @Override
    public List<AdminMenu> findAll() {
        return adminMenuMapper.findAll();
    }

    @Override
    public Set<AdminMenu> findAdminMenusByUserName(String username) {
        List<AdminMenu> menusByUserName = adminMenuMapper.findAdminMenusByUserName(username);
        Set<AdminMenu> hashSet = new HashSet<>();
        for (AdminMenu menu:menusByUserName ){
            hashSet.add(menu);
        }
        return hashSet;
    }

    @Override
    public void addAdminMenu(AdminMenu adminMenu) {
        adminMenuMapper.addAdminMenu(adminMenu);
    }

    @Override
    public void updateStatusById(Integer status, Integer id) {
        adminMenuMapper.updateStatusById(status,id);
    }
}
