package com.capgemini.jpainheritence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpainheritence.entity.Person;
@Repository
public interface PersonDao extends JpaRepository<Person, Integer>{

}
