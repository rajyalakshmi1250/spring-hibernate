package com.capgemini.jpainheritence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpainheritence.dao.PersonDao;
import com.capgemini.jpainheritence.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao dao;
	
	@Override
	public Person addNew(Person person) 
	{
		dao.save(person);
		return person;
	}

}
