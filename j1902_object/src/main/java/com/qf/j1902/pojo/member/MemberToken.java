package com.qf.j1902.pojo.member;

import lombok.Data;

@Data
public class MemberToken {
    private  Integer memberId;//会员id
    private  String token;//token
    private  Integer createTime;//token颁发时间
    private  Integer duration;//token有效时长
    private  Integer expiredTime;//token过期时间戳

}
