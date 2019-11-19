package com.oracle.prov.dashboard.model;

import java.util.ArrayList;
import java.util.List;

import com.oracle.prov.common.model.sdminput.SdmInputDetails;

public class SdmInputList {
	
	List<SdmInputDetails> sdmInputList;
	
	public SdmInputList() {
		sdmInputList = new ArrayList<>();
	}

	public List<SdmInputDetails> getSdmInputList() {
		return sdmInputList;
	}

	public void setSdmInputList(List<SdmInputDetails> sdmInputList) {
		this.sdmInputList = sdmInputList;
	}

}
