package com.springboot.dependencyInjection.controllers;

import com.springboot.dependencyInjection.services.GrettingService;

public class ConstructorInjectedController {

	private final GrettingService grettingService;

	public ConstructorInjectedController(GrettingService grettingService) {
		super();
		this.grettingService = grettingService;
	}
	
	public String syaHello() {
		return grettingService.sayGreeting();
	}
}
