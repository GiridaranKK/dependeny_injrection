package com.springboot.dependencyInjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springboot.dependencyInjection.services.GrettingService;

@Controller
public class SetterInjectedController {

//	@Autowired
//	@Qualifier("setterGreetingBean")
	private GrettingService grettingService;

//	@Qualifier("setterGreetingBean")
	@Autowired
	public void setGrettingService(@Qualifier("setterGreetingBean") GrettingService grettingService) {
		System.out.println("setter autowired");
		this.grettingService = grettingService;
	}
	
	
	public String sayHello() {
		return grettingService.sayGreeting();
	}
}
