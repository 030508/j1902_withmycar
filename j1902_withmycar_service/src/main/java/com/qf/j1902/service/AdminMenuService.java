package com.qf.j1902.service;

import com.qf.j1902.pojo.admin.AdminMenu;

import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2019/6/28 0028.
 */
public interface AdminMenuService {
    public Set<AdminMenu> findAdminMenusByName(String name);
}
