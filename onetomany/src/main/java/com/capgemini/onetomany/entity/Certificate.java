package com.capgemini.onetomany.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "certificatetable")
public class Certificate {
	@Id
	private int certificateId;
	private String cname;
	private String description;

	@ManyToOne(cascade = CascadeType.ALL)
	private Person person;
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Certificate(int certificateId, String cname, String description) {
		super();
		this.certificateId = certificateId;
		this.cname = cname;
		this.description = description;
		
	}

	public int getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	@Override
	public String toString() {
		return "Certificate [certificateId=" + certificateId + ", cname=" + cname + ", description=" + description
				+ "]";
	}
	
	

}
