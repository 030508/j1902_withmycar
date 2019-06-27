package com.qf.j1902.pojo.user;


import lombok.Data;

@Data
public class AdminRole {
  private Integer  id; //id
  private String name; //角色名称
  private  Integer deleted ; //是否有效
}
