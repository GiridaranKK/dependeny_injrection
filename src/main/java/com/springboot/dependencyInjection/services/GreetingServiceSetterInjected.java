package com.springboot.dependencyInjection.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjected implements GrettingService{

	@Override
	public String sayGreeting() {
		return "hello from setter injected!";
	}

}
