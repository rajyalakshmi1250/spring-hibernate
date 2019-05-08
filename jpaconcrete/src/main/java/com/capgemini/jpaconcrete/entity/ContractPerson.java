package com.capgemini.jpaconcrete.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name="ContractPerson")
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
}) 
public class ContractPerson extends Person {

	@Column(name="payperhour")  
	private double payPerHour;
	
	@Column(name="contractduration")  
	private String contractDuration;

	public ContractPerson() 
	{
		super();
	}

	public ContractPerson(int personId, String personName , double payPerHour, String contractDuration) 
	{
		super(personId, personName);
		this.payPerHour = payPerHour;
		this.contractDuration = contractDuration;
	}

	public double getPayPerHour() 
	{
		return payPerHour;
	}

	public void setPayPerHour(float payPerHour) 
	{
		this.payPerHour = payPerHour;
	}

	public String getContractDuration() 
	{
		return contractDuration;
	}

	public void setContractDuration(String contractDuration) 
	{
		this.contractDuration = contractDuration;
	}

	@Override
	public String toString() 
	{
		return "ContractPerson [payPerHour=" + payPerHour + ", contractDuration=" + contractDuration + "]";
	}
}
