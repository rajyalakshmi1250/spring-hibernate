package com.capgemini.jpasubclass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpasubclass.dao.PersonDao;
import com.capgemini.jpasubclass.entity.Person;
@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	PersonDao dao;
	
	@Override
	public Person addNew(Person person) 
	{
		dao.save(person);
		return person;
	}

	

}
