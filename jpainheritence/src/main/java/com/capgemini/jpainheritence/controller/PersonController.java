package com.capgemini.jpainheritence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpainheritence.entity.Person;
import com.capgemini.jpainheritence.entity.PersonWithContract;
import com.capgemini.jpainheritence.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public Person addPerson()
	{
	
		
		Person person = new PersonWithContract(101, "Raji", 30000.0, "threeHours");
		service.addNew(person);
		return person;
	}

}
