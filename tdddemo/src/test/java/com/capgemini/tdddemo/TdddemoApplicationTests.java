package com.capgemini.tdddemo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.tdddemo.controller.HelloWorldController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TdddemoApplicationTests {
	
	@Autowired
	 private HelloWorldController controller;

	@Test
	public void contextLoads() {
		
		assertThat(controller).isNotNull();
		//assertEquals("HelloWorld",new HelloWorldController().add());
		
	}
	@Test
    public void testHelloWorld(){
       //HelloWorldController h = new HelloWorldController();
       //assertTrue(controller.hello());
		assertEquals("HelloWorld",new HelloWorldController().hello());

	}
	@Test
    public void testNotHelloWorld(){
       //HelloWorldController h = new HelloWorldController();
       //assertTrue(controller.hello());
	assertNotEquals("Hello",new HelloWorldController().hello());

	}

}
