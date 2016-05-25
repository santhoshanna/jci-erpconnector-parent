package com.jci.serverregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


@ComponentScan
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerRegistry {

	public static void main(String[] args) {
	    	        SpringApplication.run(EurekaServerRegistry.class, args);

	}

}
