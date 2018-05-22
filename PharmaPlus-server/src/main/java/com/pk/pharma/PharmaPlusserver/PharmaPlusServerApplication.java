package com.pk.pharma.PharmaPlusserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PharmaPlusServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmaPlusServerApplication.class, args);
	}
}
