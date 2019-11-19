package com.rentacar.config.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradeep.rentcloud.commons.model.Customer;
import com.rentacar.config.demo.repository.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepo;

	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	@Override
	public Customer getCustomer(int custid) {

		Optional<Customer> customer = customerRepo.findById(custid);

		if (customer.isPresent()) {
			return customer.get();
		}

		return null;
	}

}
