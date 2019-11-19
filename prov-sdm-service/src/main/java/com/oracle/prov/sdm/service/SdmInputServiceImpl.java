package com.oracle.prov.sdm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.prov.common.model.sdminput.SdmInputDetails;
import com.oracle.prov.sdm.repository.SdmRepository;

@Service
public class SdmInputServiceImpl implements SdmInputService {
	
	@Autowired
	private SdmRepository sdmRepository;

	

	@Override
	public List<SdmInputDetails> getAllInputDetails() {
		// TODO Auto-generated method stub
		return (List<SdmInputDetails>) sdmRepository.findAll();
	}
	
	
	@Override
	public SdmInputDetails findBySdmInputDetails(Integer inputId) {
		// TODO Auto-generated method stub
		return sdmRepository.findBySdmInputId(inputId);
	}

	@Override
	public SdmInputDetails save(SdmInputDetails details) {
		// TODO Auto-generated method stub
		return sdmRepository.save(details);
	}

	@Override
	public List<SdmInputDetails> getAllInputsByCust(Integer custId) {
		// TODO Auto-generated method stub
		return sdmRepository.findByCustId(custId);
	}

}
