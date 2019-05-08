package com.capgemini.jpaconcrete;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.jpaconcrete.controller.PersonController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaconcreteApplicationTests {
	
     @Autowired
	 private PersonController controller;
     
	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
		
	}

}