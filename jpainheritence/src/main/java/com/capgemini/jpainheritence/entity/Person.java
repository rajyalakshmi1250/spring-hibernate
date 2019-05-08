package com.capgemini.jpainheritence.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.*;

@Entity
@Table(name = "person")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="employee")    
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="PersonId")
	private int pid;
	@Column(name="PersonName")
	private String pname;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
	
	
	

}
