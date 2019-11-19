package com.rentacar.config.demo.service;

import java.util.List;

import com.pradeep.rentcloud.commons.model.Customer;

public interface CustomerService {
	
	Customer save(Customer customer);
	
	List<Customer> getAllCustomers();
	
	Customer getCustomer(int custid);

}
