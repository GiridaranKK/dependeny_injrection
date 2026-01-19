package com.springboot.dependencyInjection.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springboot.dependencyInjection.services.GrettingService;

@Controller
public class ConstructorInjectedController {

	private final GrettingService grettingService;

	public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GrettingService grettingService) {
		super();
		this.grettingService = grettingService;
	}
	
	public String syaHello() {
		return grettingService.sayGreeting();
	}
}
