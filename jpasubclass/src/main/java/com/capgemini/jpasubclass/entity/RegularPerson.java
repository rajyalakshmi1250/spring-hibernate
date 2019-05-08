package com.capgemini.jpasubclass.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="RegularPerson1")
@PrimaryKeyJoinColumn(name="ID")
public class RegularPerson extends Person{

	
	@Column(name="salary")
	private double salary;
	
	@Column(name="bonus")
	private int bonus;

	public RegularPerson() 
	{
		super();
	}

	public RegularPerson(int personId, String personName , double salary , int bonus) 
	{
		super(personId, personName);
		this.salary=salary;
		this.bonus=bonus;
	}

	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	public int getBonus() 
	{
		return bonus;
	}

	public void setBonus(int bonus) 
	{
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "RegularPerson [salary=" + salary + ", bonus=" + bonus + "]";
	}
}
