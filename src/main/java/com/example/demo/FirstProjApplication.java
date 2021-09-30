package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjApplication.class, args);
		
		System.out.println("Welcome to Boot...");
		
		Alien a1 = context.getBean(Alien.class);
		
		a1.show();
		
		Alien a2 = context.getBean(Alien.class);
		
		a2.show();
		
		
	}
}
