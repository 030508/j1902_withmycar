package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient  //将路由服务注册到注册中心
@EnableZuulProxy
@SpringBootApplication
public class J1902WithmycarZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1902WithmycarZuulApplication.class, args);
    }

}
