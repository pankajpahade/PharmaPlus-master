package com.pk.pharma.PharmaPlusmaster;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "com.pk.pharma.controller", "com.pk.pharma.service", "com.pk.pharma.serviceImpl" })
@EntityScan("com.pk.pharma.entity")
@EnableJpaRepositories("com.pk.pharma.repository")
@SpringBootApplication
@EnableEurekaClient
public class PharmaPlusMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmaPlusMasterApplication.class, args);
	}
}
