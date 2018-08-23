package com.atguigu.xindaihou.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.xindaihou.manage.mapper")
@ComponentScan(basePackages = "com.atguigu.xindaihou")
public class XindaihouManageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(XindaihouManageServiceApplication.class, args);
	}
}
