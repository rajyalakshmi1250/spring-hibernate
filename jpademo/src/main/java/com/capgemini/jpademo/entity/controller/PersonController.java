package com.capgemini.jpademo.entity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpademo.entity.Person;
import com.capgemini.jpademo.entity.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService service;

	@RequestMapping("/")
	public String addPerson() {
		Person person = new Person(101, "raji");
		service.addPerson(person);
        return "success";
	}

	@RequestMapping("/get")
	public Person get() {
		Person person = service.getPerson(101);

		return person;

	}

}
