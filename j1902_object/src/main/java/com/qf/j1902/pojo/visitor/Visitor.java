package com.qf.j1902.pojo.visitor;

import lombok.Data;

@Data
public class Visitor {
    private  Integer id;//id
    private  String visitorGuid;//访客唯一标识
    private  Integer firstVisitTime;//访客首次访问时间
    private  String entryUrl;//访客入口页面
    private  String visitorIp;//访客IP
    private  String visitorDevice;//访客设备
    private  String visitorChannel;//访客来源渠道

}
