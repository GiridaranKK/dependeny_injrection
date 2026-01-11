package com.springboot.dependencyInjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springboot.dependencyInjection.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {
	
	PropertyInjectedController propertyInjectedController;

	@BeforeEach
	void setUp() {
		propertyInjectedController = new PropertyInjectedController();
		propertyInjectedController.grettingService = new GreetingServiceImpl();
	}
	
	@Test
	void sayHello() {
		System.out.println(propertyInjectedController.sayHello());
	}
}
