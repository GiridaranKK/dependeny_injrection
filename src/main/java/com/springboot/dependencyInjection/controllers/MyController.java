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
	

	public void beforeInit() {
		System.out.println("#11 Before Init - called by Bean post processor");
	}
	
	public void AfterInit() {
		System.out.println("#12 After Init - called by Bean post processor");
	}
}
