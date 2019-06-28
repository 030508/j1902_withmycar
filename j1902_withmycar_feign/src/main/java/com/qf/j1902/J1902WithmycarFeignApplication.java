package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient //标识为消费者
@EnableFeignClients //标识为feign客户端
@SpringBootApplication
public class J1902WithmycarFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(J1902WithmycarFeignApplication.class, args);
	}

}
