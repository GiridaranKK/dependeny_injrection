package com.springboot.dependencyInjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GrettingService {

	@Override
	public String sayGreeting() {
		return "Hello from primary bean!";
	}

}
