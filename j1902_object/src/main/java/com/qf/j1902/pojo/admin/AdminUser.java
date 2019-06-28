package com.qf.j1902.pojo.admin;

import lombok.Data;

@Data
public class AdminUser {
    private  Integer id;//id
    private  String username;//用户名
    private  String password;//用户密码
    private  String name;//用户姓名
    private  String salt;//盐值
    private  String phone;//手机
    private  String email;//邮箱
    private  Integer status;//状态
    private  Integer createTime;//创建时间
    private  Integer isSuper;//是否超级管理员
    private  String consumer;//使用者
    private  String remark;//备注
    private  String dept;//部门名称

    @Override
    public String toString() {
        return "AdminUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", salt='" + salt + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                ", isSuper=" + isSuper +
                ", consumer='" + consumer + '\'' +
                ", remark='" + remark + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
