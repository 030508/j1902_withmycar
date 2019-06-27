package com.qf.j1902.pojo.activity;

import lombok.Data;

@Data
public class ActivityDealer {
    private  Integer id;//id
    private  Integer activityId;//活动ID
    private  Integer dealerId;//经销商ID
    private  String dealerProvince;//经销商所在省
    private  String dealerCity;//经销商所在市


}
