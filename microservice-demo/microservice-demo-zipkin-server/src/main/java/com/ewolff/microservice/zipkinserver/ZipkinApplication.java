package com.ewolff.microservice.zipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
@EnableDiscoveryClient
//http://www.baeldung.com/tracing-services-with-zipkin
//https://spring.io/blog/2016/02/15/distributed-tracing-with-spring-cloud-sleuth-and-spring-cloud-zipkin
public class ZipkinApplication {

	public static void main(String[] args) {
		 SpringApplication.run(ZipkinApplication.class, args);
	}
}
