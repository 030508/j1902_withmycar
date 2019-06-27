package com.qf.j1902.pojo.activity;

import lombok.Data;

@Data
public class ActivityChannel {
    private  Integer id;//id
    private  String name;//名称
    private  Integer isDeleted;//是否已删除
    private  Integer createTime;//创建时间
    private  Integer lastUpdateTime;//最后更新时间
    private  String useCount;//使用量
    private  String signs;//渠道签名

}
