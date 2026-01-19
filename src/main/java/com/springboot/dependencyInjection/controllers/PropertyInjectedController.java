package com.springboot.dependencyInjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springboot.dependencyInjection.services.GrettingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	GrettingService grettingService;
	
	public String sayHello(){
		return grettingService.sayGreeting();
	}
}
