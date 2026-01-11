package com.springboot.dependencyInjection.controllers;

import com.springboot.dependencyInjection.services.GrettingService;

public class PropertyInjectedController {

	GrettingService grettingService;
	
	public String sayHello(){
		return grettingService.sayGreeting();
	}
}
