package com.atguigu.xindaihou.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu.xindaihou")
public class XindaihouManageWebApplication {

	public static void main(String[] args) {

		SpringApplication.run(XindaihouManageWebApplication.class, args);
	}
}
