package com.qf.j1902.pojo.often;

import lombok.Data;

@Data
public class Message {
    private  Integer id;//id
    private  String content;//消息内容
    private  Integer types;//消息类型（预留字段）
    private  String link;//消息链接
    private  Integer isSchedule;//是否定时发送（预留字段）
    private  Integer scheduleTime;//定时发送时间（预留字段）
    private  Integer sendTime;//实际发送时间

}
