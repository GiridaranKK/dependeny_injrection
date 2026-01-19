package com.springboot.dependencyInjection.controllers;

import org.springframework.stereotype.Controller;

import com.springboot.dependencyInjection.services.GrettingService;

@Controller
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
