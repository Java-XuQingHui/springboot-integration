package com.xqh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.xqh.mapper")
@SpringBootApplication
public class ProAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProAdminApplication.class, args);
	}

}
