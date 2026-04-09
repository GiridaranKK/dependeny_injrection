package com.springboot.dependencyInjection.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springboot.dependencyInjection.services.GrettingService;

@Controller
public class Myi18NController{

	private final GrettingService grettingService;
	
	public Myi18NController(@Qualifier("i18NService") GrettingService grettingService) {
		super();
		this.grettingService = grettingService;
	}



	public String sayHello() {
		return grettingService.sayGreeting();
		
	}
}
