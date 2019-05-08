package com.capgemini.jpademo.entity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpademo.entity.Person;
import com.capgemini.jpademo.entity.dao.PersonDao;
import com.capgemini.jpademo.entity.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao dao;

	@Override
	public void addPerson(Person person) {
		dao.save(person);
		
	}

	@Override
	public Person getPerson(int personid) {
		return dao.findById(personid).get();

	}

	

}
