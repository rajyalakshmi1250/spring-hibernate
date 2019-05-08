package com.capgemini.jpademo.entity.service;



import com.capgemini.jpademo.entity.Person;

public interface PersonService //extends JpaRepository<Person, Integer>
{
	public void addPerson(Person person);
	Person getPerson(int personid);
	

}
