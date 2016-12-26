package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// SpringApplication.run(Application.class, args);

		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		System.out.println(ctx.getDisplayName());
		
		System.out.println(" This is the gocd verification code change");
		System.out.println("This is my first Spring Boot Example");

	}
}
