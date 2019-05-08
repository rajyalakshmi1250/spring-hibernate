package com.capgemini.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onetomany.entity.Person;
import com.capgemini.onetomany.entity.dao.CertificateDao;
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private CertificateDao dao;

	
	@Override
	public void add(Person person) {
		dao.save(person);

	}

	@Override
	public Person getById(int id) {
		return dao.findById(id).get();
	}

}
