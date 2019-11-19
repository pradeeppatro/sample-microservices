package com.oracle.prov.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.oracle.prov.common.model.customer.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	Customer findByCustCsi(String custCsi);
	Customer findByCustId(Integer custId);
	Customer findByCustName(String custName);
	//Customer findByCustNameIgnoreCase(String custName);
	
}
