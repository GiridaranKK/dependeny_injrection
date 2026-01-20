package com.springboot.dependencyInjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GrettingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello Everyone from base service.";
	}

}
