package com.capgemini.onetomany.service;

import com.capgemini.onetomany.entity.Person;

public interface PersonService {
	
	public void add(Person person);

	public Person getById(int id);

}
