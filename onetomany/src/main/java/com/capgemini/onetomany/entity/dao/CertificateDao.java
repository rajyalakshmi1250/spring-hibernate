package com.capgemini.onetomany.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onetomany.entity.Person;

@Repository
public interface CertificateDao extends JpaRepository<Person, Integer> {

}
