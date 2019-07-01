package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*@EnableEurekaClient //标识生产者*/
@SpringBootApplication
public class J1902WithmycarControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1902WithmycarControllerApplication.class, args);
    }

}
