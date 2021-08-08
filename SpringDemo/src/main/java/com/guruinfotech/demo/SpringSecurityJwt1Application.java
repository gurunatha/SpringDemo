package com.guruinfotech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSecurityJwt1Application {
	
	@GetMapping("/index")
	public String hello() {
		System.out.println("================");
		System.out.println("11111111111111");
		System.out.println("222222222222222");
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwt1Application.class, args);
	}

}
