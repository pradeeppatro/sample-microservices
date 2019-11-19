package com.oracle.prov.sdm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.prov.common.model.sdminput.SdmInputDetails;
import com.oracle.prov.sdm.service.SdmInputService;

@RestController
@RequestMapping(value = "/sdmapi", produces = "application/json")
public class SdmController {
	
	@Autowired
	private SdmInputService sdmService;
	
	
	
	@GetMapping("/all")
	public List<SdmInputDetails> getAllCustomers(){
		return sdmService.getAllInputDetails();
	}
	
	/*
	 * @GetMapping("/{custName}") public Customer getCustomerByName(@PathVariable
	 * String custName) { return customerService.getCustomerByName(custName); }
	 */
	
	@GetMapping("/{inputId}")
	public SdmInputDetails getInputsById(@PathVariable Integer inputId) {
		return sdmService.findBySdmInputDetails(inputId);
	}
	
	@GetMapping("/customer/{custId}")
	public List<SdmInputDetails> getInputsByCustId(@PathVariable Integer custId) {
		return sdmService.getAllInputsByCust(custId);
	}
	
	@PostMapping("/add")
	public SdmInputDetails addCustomer(@RequestBody SdmInputDetails sdmInput) {
		return sdmService.save(sdmInput);
	}
	

	
}
