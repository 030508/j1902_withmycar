package com.qf.j1902.pojo.often;

import lombok.Data;

@Data
public class Tag {
    private  Integer id;//id
    private  String name;//标签名称
    private  Integer isDeleted;//是否删除
    private  Integer createTime;//创建时间
    private  Integer lastUpdateTime;//最后更新时间
    private  Integer clickCount;//标签被点击次数
    private  Integer types;//标签类型

}
