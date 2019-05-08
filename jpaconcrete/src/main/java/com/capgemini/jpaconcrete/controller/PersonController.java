package com.capgemini.jpaconcrete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpaconcrete.entity.Person;
import com.capgemini.jpaconcrete.service.PersonService;
@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@PostMapping("/post")
	public Person addPerson(Person person)
	{		
		//RegularPerson person = new RegularPerson(151, "suma", 3000, 2000);
		return service.addNew(person);
		
		//return person;
	}
	
	@PostMapping("/put")
	public Person addPersona(Person person)
	{		
		//RegularPerson person = new RegularPerson(151, "suma", 3000, 2000);
		return service.addNew(person);
		
		//return person;
	}

}
