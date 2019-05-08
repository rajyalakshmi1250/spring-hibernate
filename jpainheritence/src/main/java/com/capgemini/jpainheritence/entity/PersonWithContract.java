package com.capgemini.jpainheritence.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("contractEmployee")
public class PersonWithContract extends Person{
	@Column(name="pay_per_day")
	private double pay_per_day;
	@Column(name="contractDuration")
	private String contractDuration;
	public PersonWithContract() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonWithContract(int pid, String pname, double pay_per_day, String contractDuration) {
		super( pid,  pname );
		this.pay_per_day = pay_per_day;
		this.contractDuration = contractDuration;
	}
	public double getPay_per_day() {
		return pay_per_day;
	}
	public void setPay_per_day(double pay_per_day) {
		this.pay_per_day = pay_per_day;
	}
	public String getContractDuration() {
		return contractDuration;
	}
	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}
	@Override
	public String toString() {
		return "PersonWithContract [pay_per_day=" + pay_per_day + ", contractDuration=" + contractDuration + "]";
	}
	
	
	

}
