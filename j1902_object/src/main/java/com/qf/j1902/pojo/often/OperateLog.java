package com.qf.j1902.pojo.often;

import lombok.Data;

@Data
public class OperateLog {
    private  Integer id;//id
    private  Integer operateTime;//操作时间
    private  Integer operateUid;//操作人ID
    private  String tableName;//操作数据表物理名称
    private  String tableDisname;//操作数据表显示名称
    private  Integer dataId;//操作数据ID
    private  String operateDesc;//操作描述

}
