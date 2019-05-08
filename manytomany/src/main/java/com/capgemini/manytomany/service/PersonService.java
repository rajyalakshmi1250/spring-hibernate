package com.capgemini.manytomany.service;

import java.util.Set;

import com.capgemini.manytomany.entity.Person;

public interface PersonService {
	
	public Set<Person> addNew(Set<Person> person);
	//public Person getPerson();

}
