package com.capgemini.persononetoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class Person {
	@Id
	private int personid;
	private String personName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Profile profile;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int personid, String personName, Profile profile) {
		super();
		this.personid = personid;
		this.personName = personName;
		this.profile = profile;
	}
	
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "Person [personid=" + personid + ", personName=" + personName + ", profile=" + profile + "]";
	}
	
	
	
	  

}
