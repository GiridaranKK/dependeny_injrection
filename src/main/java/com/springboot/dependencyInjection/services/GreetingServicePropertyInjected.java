package com.springboot.dependencyInjection.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GrettingService{

	@Override
	public String sayGreeting() {
		return "hello from property injector greeting service.";
	}

}
