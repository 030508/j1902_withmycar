package com.qf.j1902.pojo.visitor;

import lombok.Data;

@Data
public class VisitLog {
    private  Integer id;//id
    private  Integer visitorId;//访客ID
    private  Integer memberId;//会员ID
    private  String visitUrl;//页面访问路径
    private  String visitIp;//访问IP
    private  String visitDevice;//访问设备
    private  String visitSource;//访问渠道
    private  Integer enterTime;//进入时间
    private  Integer exitTime;//离开时间
    private  Integer stay;//停留时间（秒）

}
