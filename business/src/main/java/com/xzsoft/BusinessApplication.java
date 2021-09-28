package com.xzsoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.xzsoft.**.mapper")
@SpringBootApplication
public class BusinessApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BusinessApplication.class, args);
	}
}