package com.oracle.prov.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.prov.common.model.customer.Customer;
import com.oracle.prov.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Customer getCustomerByName(String custName) {
		// TODO Auto-generated method stub
		return customerRepository.findByCustName(custName);
	}

	@Override
	public Customer getCustomerById(Integer custId) {
		// TODO Auto-generated method stub
		return customerRepository.findByCustId(custId);
	}

	@Override
	public Customer getCustomerByCsi(String custCsi) {
		// TODO Auto-generated method stub
		return customerRepository.findByCustCsi(custCsi);
		
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

}
