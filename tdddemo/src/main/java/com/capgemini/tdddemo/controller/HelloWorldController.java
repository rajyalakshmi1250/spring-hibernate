package com.capgemini.tdddemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

	@PostMapping("/post")
	public String hello() {
		return "HelloWorld";
	}

}