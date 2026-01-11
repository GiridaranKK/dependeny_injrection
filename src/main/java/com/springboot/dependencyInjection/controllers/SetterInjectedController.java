package com.springboot.dependencyInjection.controllers;

import com.springboot.dependencyInjection.services.GrettingService;

public class SetterInjectedController {

	private GrettingService grettingService;

	public void setGrettingService(GrettingService grettingService) {
		this.grettingService = grettingService;
	}
	
	
	public String sayHello() {
		return grettingService.sayGreeting();
	}
}
