package com.simplilearn.workshop.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingResource {
	@RequestMapping("/")
public String greetings() {
	
	return "hello !Spring boot";
}
}
