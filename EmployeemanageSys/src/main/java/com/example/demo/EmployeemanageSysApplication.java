package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo","controller","service"})
public class EmployeemanageSysApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeemanageSysApplication.class, args);
		
	}

}
