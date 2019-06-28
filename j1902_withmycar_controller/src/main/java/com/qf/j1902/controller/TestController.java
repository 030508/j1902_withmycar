package com.qf.j1902.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/6/28 0028.
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test")
    public String test(){
        System.out.println("调用成功");
        return "sucessful";
    }

}
