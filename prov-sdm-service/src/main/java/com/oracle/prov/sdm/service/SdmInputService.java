package com.oracle.prov.sdm.service;

import java.util.List;

import com.oracle.prov.common.model.sdminput.SdmInputDetails;

public interface SdmInputService {
	
	List<SdmInputDetails> getAllInputDetails();
	
	SdmInputDetails findBySdmInputDetails(Integer inputId);
	
	SdmInputDetails save(SdmInputDetails details);
	
	List<SdmInputDetails> getAllInputsByCust(Integer custId);

}
