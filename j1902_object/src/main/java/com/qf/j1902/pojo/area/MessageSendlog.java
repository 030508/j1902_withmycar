package com.qf.j1902.pojo.area;

import lombok.Data;

@Data
public class MessageSendlog {
    private  Integer id;//id
    private  Integer messageId;//消息id
    private  Integer sendTime;//发送时间
    private  Integer toMid;//接收人
    private  Integer received;//是否已接收
    private  Integer receiveTime;//接收时间
    private  Integer viewed;//是否已阅读
    private  Integer viewTime;//阅读时间
    private  Integer viewTetail;//是否阅读详情
    private  Integer viewTetailTime;//阅读详情时间

}
