package com.oracle.prov.sdm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(basePackages = "com.oracle.prov.common.model.sdminput")
@EnableEurekaClient
public class ProvSdmServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvSdmServiceApplication.class, args);
	}

}
