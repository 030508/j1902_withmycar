package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.AdminRoleMapper;
import com.qf.j1902.pojo.admin.AdminRole;
import com.qf.j1902.service.AdminRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminRoleServiceImpl implements AdminRoleService {
    @Resource
    private AdminRoleMapper adminRoleMapper ;
    @Override
    public List<AdminRole> findAll() {
        return adminRoleMapper.findAll();
    }

    @Override
    public List<AdminRole> findAdminRolesByUserName(String username) {
        return adminRoleMapper.findAdminRolesByUserName(username);
    }

    @Override
    public void deleteAdminRoleById(Integer id) {
        adminRoleMapper.deleteAdminRoleById(id);
    }

    @Override
    public void addAdminRoleById(AdminRole adminRole) {
            adminRoleMapper.addAdminRoleById(adminRole);
    }

    @Override
    public void updateDeletedById(Integer id, Integer deleted) {
        adminRoleMapper.updateDeletedById(id, deleted);
    }
}
