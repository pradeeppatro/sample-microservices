package com.oracle.prov.common.model.sdminput;

import java.sql.Timestamp;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "PROV_SDM_INPUT")
public class SdmInputDetails {
	
	@Id
	@Column(name= "SDM_INPUT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sdmInputId;
	
	@Column(name= "CUST_ID",columnDefinition = "integer", nullable = false)
	private Integer custId;
	
	@Column(name= "SDM_EMAIL", nullable = false)
	private String sdmEmail;
	
	@Column(name= "SERVICE_BOM", nullable = false)
	private String serviceBom;
	
	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	@Column(name = "REQ_STATUS")
	private String reqStatus;
	
	@Column(name = "CREATED_DATE")
	@CreationTimestamp
	private Timestamp  createdDate;
	
	@Column(name = "UPDATED_DATE")
	@UpdateTimestamp
	private Timestamp  updatedDate;

	public Integer getSdmInputId() {
		return sdmInputId;
	}

	public void setSdmInputId(Integer sdmInputId) {
		this.sdmInputId = sdmInputId;
	}

	public String getSdmEmail() {
		return sdmEmail;
	}

	public void setSdmEmail(String sdmEmail) {
		this.sdmEmail = sdmEmail;
	}

	public String getServiceBom() {
		return serviceBom;
	}

	public void setServiceBom(String serviceBom) {
		this.serviceBom = serviceBom;
	}

	public String getReqStatus() {
		return reqStatus;
	}

	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}

	public Timestamp  getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Timestamp  createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp  getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(Timestamp  updatedDate) {
		this.updatedDate = updatedDate;
	}

	
	
	

}
