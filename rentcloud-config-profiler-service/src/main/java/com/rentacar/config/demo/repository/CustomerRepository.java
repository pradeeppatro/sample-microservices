package com.rentacar.config.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pradeep.rentcloud.commons.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
