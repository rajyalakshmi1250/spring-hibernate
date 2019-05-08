package com.capgemini.manytomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.manytomany.entity.Person;
import com.capgemini.manytomany.entity.Project;
import com.capgemini.manytomany.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public Set<Person> addNewPerson()
	{
		Set<Project> project = new HashSet<Project>();
		project.add(new Project(1 , "cloud project"));
		project.add(new Project(2 , "SAP "));
		
		Set<Person> person = new HashSet<Person>();
		person.add(new Person(101, "cherry", project));
		person.add(new Person(102, "shanu", project));
		
		service.addNew(person);
		return person;
	}
}
