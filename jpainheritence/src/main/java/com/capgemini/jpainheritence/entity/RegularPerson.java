package com.capgemini.jpainheritence.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("RegularPerson")

public class RegularPerson extends Person{
	@Column(name="actual_salary")
	private double salary;
	@Column(name="bonus_salary")
	private double bonus_salary;
	public RegularPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegularPerson(int pid, String pname, double salary, double bonus_salary) {
		super( pid,  pname);
		this.salary = salary;
		this.bonus_salary = bonus_salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus_salary() {
		return bonus_salary;
	}
	public void setBonus_salary(double bonus_salary) {
		this.bonus_salary = bonus_salary;
	}
	@Override
	public String toString() {
		return "RegularPerson [salary=" + salary + ", bonus_salary=" + bonus_salary + "]";
	}
	
	
	

}
