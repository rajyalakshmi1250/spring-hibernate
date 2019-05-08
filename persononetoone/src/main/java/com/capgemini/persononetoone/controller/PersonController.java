package com.capgemini.persononetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.persononetoone.dao.ProfileDao;
import com.capgemini.persononetoone.entity.Person;
import com.capgemini.persononetoone.entity.Profile;



@RestController
public class PersonController {

	@Autowired
	private ProfileDao dao;

	@RequestMapping("/")
	public void addPerson() {
		Person person = new Person(101, "raji",new Profile(201,"cloud"));
		dao.save(person);
        //      return "success";
	}

	@RequestMapping("/get")
	public Person get() {
		Person person = dao.findById(101).get();

		return person;

	}

}
