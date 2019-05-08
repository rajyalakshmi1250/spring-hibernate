package com.capgemini.persononetoone.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.persononetoone.entity.Person;

public interface ProfileDao extends JpaRepository<Person, Integer> {

}
