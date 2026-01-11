package com.springboot.dependencyInjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springboot.dependencyInjection.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
	
	SetterInjectedController setterInjectedController;

	@BeforeEach
	void setUp() {
		setterInjectedController = new SetterInjectedController();
		//setterInjectedController.setGrettingService(new GreetingServiceImpl()); - if this line not there gives nullpointerexception
		setterInjectedController.setGrettingService(new GreetingServiceImpl());
	}
	
	@Test
	void sayHello() {
	System.out.println(setterInjectedController.sayHello());
	}
}
