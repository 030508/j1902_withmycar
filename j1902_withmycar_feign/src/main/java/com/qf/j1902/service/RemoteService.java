package com.qf.j1902.service;

import com.qf.j1902.service.impl.FeignHystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/6/28 0028.
 */
@FeignClient(value = "server-provider",fallback =FeignHystrixServiceImpl.class)
public interface RemoteService {
    @RequestMapping(value = "/test")
    public String fetch();
}
