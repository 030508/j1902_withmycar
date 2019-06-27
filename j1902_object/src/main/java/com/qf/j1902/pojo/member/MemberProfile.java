package com.qf.j1902.pojo.member;

import lombok.Data;

@Data
public class MemberProfile {
    private  Integer id;//会员id
    private  String nickname;//会员昵称
    private  String name;//会员姓名
    private  Integer gender;//会员性别
    private  Integer levels;//会员等级（预留字段）
    private  String avatarUrl;//会员头像url
    private  String mobileCode;//手机号国家区域代码
    private  String mobile;//手机号
    private  String email;//邮箱
    private  String description;//个人简介
    private  Integer country;//所在国家
    private  Integer province;//所在省份
    private  Integer city;//所在城市
    private  Integer district;//所在区
    private  String address;//详细地址
    private  Integer registerTime;//会员注册时间
    private  Integer point;//会员积分

}
