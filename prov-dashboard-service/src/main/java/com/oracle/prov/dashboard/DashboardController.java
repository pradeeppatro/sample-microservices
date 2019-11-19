package com.oracle.prov.dashboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.oracle.prov.common.model.customer.Customer;
import com.oracle.prov.common.model.sdminput.SdmInputDetails;
import com.oracle.prov.dashboard.model.SdmInputList;



@RestController
@RequestMapping("/dashboard")
public class DashboardController {
	
	@LoadBalanced
	@Bean
	RestTemplate getRestTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/sdminputs/customer/{custId}")
	public  @ResponseBody List<SdmInputDetails> getAllSdmInputsByCustomer(@PathVariable Integer custId) {
		/*
		 * Working code
		ResponseEntity<SdmInputDetails[]> responseEntity = restTemplate.getForEntity("http://localhost:9092/sdmapi/customer/"+custId, SdmInputDetails[].class);
		SdmInputDetails[] objects = responseEntity.getBody();
		MediaType contentType = responseEntity.getHeaders().getContentType();
		HttpStatus statusCode = responseEntity.getStatusCode();
		System.out.println("contentType:"+contentType);
		System.out.println("statusCode:"+statusCode);*/
		//SdmInputList response = restTemplate.getForObject("http://localhost:9092/sdmapi/customer/"+custId, SdmInputList.class);
		
		//System.out.println(response);
		List<SdmInputDetails> objects = null;
		//String uri = "http://localhost:9092/sdmapi/customer/"+custId;
		String uri = "http://SDMSERVICE/sdmapi/customer/"+custId;
		
		try {
			ResponseEntity<List<SdmInputDetails>> objectResponse = restTemplate.exchange(
					uri, 
					HttpMethod.GET,
					null,
					new ParameterizedTypeReference<List<SdmInputDetails>>() {});
			if(objectResponse != null && objectResponse.hasBody()){
				objects = objectResponse.getBody();
			}
		} catch (RestClientException e) {
			
			e.printStackTrace();
		} 
		
		return objects;
	}
	
	
	@GetMapping("/customer/all")
	public  @ResponseBody List<Customer> getAllCustomers() {
		/*
		 * Working code
		ResponseEntity<SdmInputDetails[]> responseEntity = restTemplate.getForEntity("http://localhost:9092/sdmapi/customer/"+custId, SdmInputDetails[].class);
		SdmInputDetails[] objects = responseEntity.getBody();
		MediaType contentType = responseEntity.getHeaders().getContentType();
		HttpStatus statusCode = responseEntity.getStatusCode();
		System.out.println("contentType:"+contentType);
		System.out.println("statusCode:"+statusCode);*/
		//SdmInputList response = restTemplate.getForObject("http://localhost:9092/sdmapi/customer/"+custId, SdmInputList.class);
		
		//System.out.println(response);
		List<Customer> objects = null;
		//String uri = "http://localhost:9091/customerapi/all";
		String uri = "http://CUSTOMERSERVICE/customerapi/all";
		try {
			ResponseEntity<List<Customer>> objectResponse = restTemplate.exchange(
					uri, 
					HttpMethod.GET,
					null,
					new ParameterizedTypeReference<List<Customer>>() {});
			if(objectResponse != null && objectResponse.hasBody()){
				objects = objectResponse.getBody();
			}
		} catch (RestClientException e) {
			
			e.printStackTrace();
		} 
		
		return objects;
	}

}
