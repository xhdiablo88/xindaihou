package com.atguigu.xindaihou.usermanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu.xindaihou")
public class XindaihouUsermanageApplication {

	public static void main(String[] args) {
		SpringApplication.run(XindaihouUsermanageApplication.class, args);
	}
}
