package com.qf.j1902.mapper;

import com.qf.j1902.pojo.admin.AdminRole;
import org.apache.ibatis.annotations.Mapper;

import javax.management.relation.Role;
import java.util.List;

@Mapper
public interface AdminRoleMapper {
    List<AdminRole> findAll();  //查询所有角色
    List<AdminRole> findAdminRolesByUserName(String username); //查询单个管理员拥有的角色

    void  deleteAdminRoleById(Integer id);  //根据id删除角色
    void  addAdminRoleById(AdminRole adminRole);  //添加角色信息
    void  updateDeletedById(Integer id ,Integer deleted); //根据id修改状态（是否有效）


}
