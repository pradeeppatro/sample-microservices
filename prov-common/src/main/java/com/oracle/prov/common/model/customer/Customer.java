package com.oracle.prov.common.model.customer;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROV_CUSTOMER")
public class Customer {
	
	@Id
	@Column(name= "CUST_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer custId;
	
	@Column(name= "CUST_NAME")
	private String custName;
	
	@Column(name= "CUST_CSI")
	private String custCsi;

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustCsi() {
		return custCsi;
	}

	public void setCustCsi(String custCsi) {
		this.custCsi = custCsi;
	}

}
