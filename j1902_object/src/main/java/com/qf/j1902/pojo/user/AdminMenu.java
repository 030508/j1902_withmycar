package com.qf.j1902.pojo.user;

import lombok.Data;

@Data
public class AdminMenu {
   private Integer id;
    private String controller;
    private  String action ;
    private  String name;
    private  String classname;
    private Integer status;
    private Integer sort;
    private  Integer types	;
   private Integer parentId;
}
