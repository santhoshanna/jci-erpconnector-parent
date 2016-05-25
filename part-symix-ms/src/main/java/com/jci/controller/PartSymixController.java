package com.jci.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
public class PartSymixController {

	public static void main(String[] args) {
		System.out.println("In Controller");
		SpringApplication.run(PartSymixController.class, args);

	}

}
