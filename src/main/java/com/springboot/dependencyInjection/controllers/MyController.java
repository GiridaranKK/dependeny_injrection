package com.springboot.dependencyInjection.controllers;

import org.springframework.stereotype.Controller;

import com.springboot.dependencyInjection.services.GreetingServiceImpl;
import com.springboot.dependencyInjection.services.GrettingService;

@Controller
public class MyController {
	
	private final GrettingService greetingService;
	
	public MyController() {
		super();
		this.greetingService = new GreetingServiceImpl();
	}



	public String sayHello() {
		System.out.println("I'm in the controller");
		return greetingService.sayGreeting();
	}
}
