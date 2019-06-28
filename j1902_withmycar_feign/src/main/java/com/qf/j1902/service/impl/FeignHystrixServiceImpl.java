package com.qf.j1902.service.impl;

import com.qf.j1902.service.RemoteService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/6/28 0028.
 */
@Service
public class FeignHystrixServiceImpl implements RemoteService {
    @Override
    public String fetch() {
        return "fallback sucessful";
    }
}
