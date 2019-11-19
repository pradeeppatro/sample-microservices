package com.oracle.prov.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "com.oracle.prov.common")
@EnableEurekaClient
public class ProvDashboardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvDashboardServiceApplication.class, args);
	}

}
