package com.capgemini.onetomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

	@Id
	private int personid;
	private String personName;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Certificate> certificate;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int personid, String personName, Set<Certificate> certificate) {
		super();
		this.personid = personid;
		this.personName = personName;
		this.certificate = certificate;
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

	public Set<Certificate> getCertificate() {
		return certificate;
	}

	public void setcertificate(Set<Certificate> certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Person [personid=" + personid + ", personName=" + personName + ", certificate=" + certificate + "]";
	}

}
