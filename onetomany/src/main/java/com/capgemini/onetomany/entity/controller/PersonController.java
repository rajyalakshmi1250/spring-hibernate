package com.capgemini.onetomany.entity.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onetomany.entity.Certificate;
import com.capgemini.onetomany.entity.Person;
import com.capgemini.onetomany.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService service;

	@RequestMapping("/new")
	public String addPerson() {
		Set<Certificate> set = new HashSet<Certificate>();

		/*
		 * Certificate c1 = new Certificate(201, ".net", "training certificate");
		 * Certificate c2 = new Certificate(202, "cloud", "training certificate");
		 */

		set.add(new Certificate(1, ".net", "training certificate"));
		set.add(new Certificate(2, "cloud", "training certificate"));

		service.add(new Person(101, "Raji", set));
		return "Successful";

	}

	@RequestMapping("/person")
	public Person get() {
		// Person person = dao.findById(101).get();

		return service.getById(101);
	}

}
