package com.rentacar.config.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EntityScan(basePackages = "com.pradeep.rentcloud.commons")
//@EnableAutoConfiguration(exclude=DataSourceAutoConfiguration.class)
public class RentcloudConfigProfilerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentcloudConfigProfilerServiceApplication.class, args);
	}

}
