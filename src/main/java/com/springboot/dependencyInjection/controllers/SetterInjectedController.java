package com.springboot.dependencyInjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springboot.dependencyInjection.services.GrettingService;

@Controller
public class SetterInjectedController {

//	@Autowired
	private GrettingService grettingService;

	@Autowired
	public void setGrettingService(GrettingService grettingService) {
		System.out.println("setter autowired");
		this.grettingService = grettingService;
	}
	
	
	public String sayHello() {
		return grettingService.sayGreeting();
	}
}
