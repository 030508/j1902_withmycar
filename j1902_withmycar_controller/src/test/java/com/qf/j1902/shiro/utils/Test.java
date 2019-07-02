package com.qf.j1902.shiro.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * Created by Administrator on 2019/6/29 0029.
 */
public class Test {

    @org.junit.Test
    public void testmd5(){
        String md5ofStr = new MD5().getMD5ofStr("admin");
        String admin = new MD5().getMD5ofStr("admin");
        Md5Hash admin1 = new Md5Hash("admin", null, 1024);
        System.out.println(admin1.toString());
    }

    @org.junit.Test
    public void wew(){

    }
}
