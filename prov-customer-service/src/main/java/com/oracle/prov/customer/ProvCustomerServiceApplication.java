package com.oracle.prov.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "com.oracle.prov.common.model.customer")
@EnableEurekaClient
public class ProvCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvCustomerServiceApplication.class, args);
	}

}
