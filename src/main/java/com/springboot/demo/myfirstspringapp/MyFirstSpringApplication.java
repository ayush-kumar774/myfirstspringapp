package com.springboot.demo.myfirstspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
	@SpringBootApplication(
		scanBasePackages = ("com.springboot.demo.utils")
	)
 */

@SpringBootApplication
public class MyFirstSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringApplication.class, args);
	}

}
