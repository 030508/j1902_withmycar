package com.qf.j1902.pojo.user;

import lombok.Data;

@Data
public class AdminUser {
    private Integer id;  //管理员id
    private String username; // 管理员登录名
    private String password; //登录密码
    private String name; //管理员姓名
    private String salt;  //盐
    private String phone; //电话号码
    private String email; //电子邮件
    private Integer status; //状态
    private Integer createTime; //创建时间
    private Integer isSuper; //是否超级管理员
    private String consumer; //
    private String remark; // 备注
    private String dept; //部门

}
