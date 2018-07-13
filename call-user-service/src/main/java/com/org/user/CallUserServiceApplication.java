package com.org.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CallUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallUserServiceApplication.class, args);
	}
}
