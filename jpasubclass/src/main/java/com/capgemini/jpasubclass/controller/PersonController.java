package com.capgemini.jpasubclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpasubclass.entity.Person;
import com.capgemini.jpasubclass.entity.RegularPerson;
import com.capgemini.jpasubclass.service.PersonService;

@RestController
public class PersonController {

	
	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public Person addPerson()
	{		
		RegularPerson person = new RegularPerson(152, "kushi", 10000, 2000);
		service.addNew(person);
		
		return person;
	}
}
