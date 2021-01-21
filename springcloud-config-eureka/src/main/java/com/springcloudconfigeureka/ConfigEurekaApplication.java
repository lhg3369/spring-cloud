package com.springcloudconfigeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigEurekaApplication.class, args);
		 System.out.println("config 注册中心服务启动...");
	}
}
