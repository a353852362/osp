package com.xzsoft;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.xzsoft"})
public class AppApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
}