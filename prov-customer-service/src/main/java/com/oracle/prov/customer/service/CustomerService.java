package com.oracle.prov.customer.service;

import java.util.List;

import com.oracle.prov.common.model.customer.Customer;

public interface CustomerService {
	
	List<Customer> getAllCustomers();
	Customer getCustomerByName(String custName);
	Customer getCustomerById(Integer custId);
	Customer getCustomerByCsi(String custCsi);
	
	Customer addCustomer(Customer customer);

}
