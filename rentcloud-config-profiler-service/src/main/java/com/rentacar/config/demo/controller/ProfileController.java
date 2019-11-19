package com.rentacar.config.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.rentcloud.commons.model.Customer;
import com.rentacar.config.demo.service.CustomerService;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/profile")
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
	
	@GetMapping("/profiles")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/profile")
	public ResponseEntity<Customer> getAllCustomers(@RequestParam int custid){
		Customer customer = customerService.getCustomer(custid);
		System.out.println("Cust:"+customer);
		if(null == customer) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok().body(customer);
		}
	}
	

}
