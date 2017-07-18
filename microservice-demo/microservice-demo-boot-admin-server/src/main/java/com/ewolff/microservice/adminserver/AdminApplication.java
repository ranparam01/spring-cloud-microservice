package com.ewolff.microservice.adminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import de.codecentric.boot.admin.config.EnableAdminServer;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
public class AdminApplication {

	public static void main(String[] args) {
//		new SpringApplicationBuilder(AdminApplication.class).web(true).run(args);
		 SpringApplication.run(AdminApplication.class, args);
	}

}
