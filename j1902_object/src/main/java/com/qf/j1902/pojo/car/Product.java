package com.qf.j1902.pojo.car;

import lombok.Data;

@Data
public class Product {
    private  Integer id;//id
    private  String name;//自有商品名称
    private  String description;//车型说明
    private  String service;//售后服务
    private  Integer createTime;//创建时间
    private  Integer updateTime;//最后更新时间

}
