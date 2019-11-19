package com.oracle.prov.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.prov.common.model.customer.Customer;
import com.oracle.prov.customer.service.CustomerService;

@RestController
@RequestMapping("/customerapi")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/all")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	/*
	 * @GetMapping("/{custName}") public Customer getCustomerByName(@PathVariable
	 * String custName) { return customerService.getCustomerByName(custName); }
	 */
	
	@GetMapping("/{custId}")
	public Customer getCustomerByName(@PathVariable Integer custId) {
		return customerService.getCustomerById(custId);
	}
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	

	
}
