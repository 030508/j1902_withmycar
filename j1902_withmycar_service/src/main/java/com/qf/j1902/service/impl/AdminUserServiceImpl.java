package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.AdminUserMapper;
import com.qf.j1902.pojo.admin.AdminUser;
import com.qf.j1902.pojo.utils.PageBean;
import com.qf.j1902.service.AdminUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Resource
    private AdminUserMapper adminUserMapper;

    public Integer findAllCount() {  //查询数据库总条数
        return adminUserMapper.findAllCount();
    }

    //分页查询
    @Override
    public PageBean<AdminUser> findPageBean(Integer currentPage,Integer pageSize) {  //按固定条数查询
        PageBean<AdminUser> userPageBean = new PageBean<>(currentPage, findAllCount(),pageSize);
        List<AdminUser> userList = adminUserMapper.findAll(userPageBean.getStartIndex(), userPageBean.getStartIndex() + pageSize - 1);
       userPageBean.setList(userList);
        return userPageBean;
    }

    @Override
    public AdminUser findOneByName(String username) {
        return adminUserMapper.findOneByName(username);
    }

    @Override
    public void deleteOneByName(String username) {
        adminUserMapper.deleteOneByName(username);
    }

    @Override
    public void addByAdminUser(AdminUser adminUser) {
        adminUserMapper.addByAdminUser(adminUser);
    }

    @Override
    public void updetaOneByName(String phone, String email, String username) {
        adminUserMapper.updetaOneByName(phone,email,username);
    }

    @Override
    public void updetaPasswordByName(String password, String username) {
        adminUserMapper.updetaPasswordByName(password,username);
    }

    @Override
    public void updatestatusByName(Integer status, String username) {
        adminUserMapper.updatestatusByName(status,username);
    }


}

