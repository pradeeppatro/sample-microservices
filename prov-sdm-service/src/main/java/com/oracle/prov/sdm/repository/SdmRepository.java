package com.oracle.prov.sdm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oracle.prov.common.model.sdminput.SdmInputDetails;

public interface SdmRepository extends JpaRepository<SdmInputDetails, Integer> {
	
	SdmInputDetails findBySdmInputId(Integer sdmInputId);
	
	
	List<SdmInputDetails> findByCustId(Integer custId);

	
}
