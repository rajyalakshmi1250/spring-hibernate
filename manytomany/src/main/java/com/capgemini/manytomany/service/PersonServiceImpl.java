package com.capgemini.manytomany.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.manytomany.dao.PersonDao;
import com.capgemini.manytomany.entity.Person;

@Service
public class PersonServiceImpl implements PersonService
{

	@Autowired
	PersonDao dao;
	
	@Override
	public Set<Person> addNew(Set<Person> person) 
	{
		dao.saveAll(person);
		return person;
	}

	

}
