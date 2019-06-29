package com.qf.j1902.shiro.utils;

/**
 * Created by Administrator on 2019/6/29 0029.
 */
public class Test {
    @org.junit.Test
    public void testmd5(){
        String md5ofStr = new MD5().getMD5ofStr("admin");
        System.out.println(md5ofStr);
    }
}
