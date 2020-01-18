package com.potatoday.demo.spring.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 主服务入口
 * @author raistlin
 */
@SpringBootApplication(scanBasePackages = {"com.potatoday.demo.spring.service"})
@ImportResource({"classpath:spring-mybatis.xml"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
