package com.qf.j1902.controller;

import com.qf.j1902.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/6/28 0028.
 */
@RestController
public class TestController {
    @Autowired
    private RemoteService remoteService;
    @RequestMapping(value = "/jjj")
    public String test(){
        String fetch = remoteService.fetch();
        return fetch;
    }
}
