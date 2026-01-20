package com.springboot.dependencyInjection.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springboot.dependencyInjection.services.GrettingService;

@Controller
public class EnvironmentController {

	private final GrettingService grettingService;

	public EnvironmentController(@Qualifier("EnvService") GrettingService grettingService) {
		super();
		this.grettingService = grettingService;
	}
	
	public String sayEnvironment() {
		return grettingService.sayGreeting();
		
	}
}
