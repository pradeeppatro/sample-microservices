package com.oracle.prov.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.oracle.prov.gateway.zuul.filters.ErrorFilter;
import com.oracle.prov.gateway.zuul.filters.PostFilter;
import com.oracle.prov.gateway.zuul.filters.PreFilter;
import com.oracle.prov.gateway.zuul.filters.RouteFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ProvApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvApiGatewayApplication.class, args);
	}
	
	@Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

}
