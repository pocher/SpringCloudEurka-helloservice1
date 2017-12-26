package com.learning.pocher.helloserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloServer1Application.class, args);
	}
}
