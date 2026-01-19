package com.springboot.dependencyInjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.dependencyInjection.services.GreetingServiceImpl;

@SpringBootTest
public class PropertyInjectedControllerTest {
	
	@Autowired
	PropertyInjectedController propertyInjectedController;

//	@BeforeEach
//	void setUp() {
//		propertyInjectedController = new PropertyInjectedController();
//		propertyInjectedController.grettingService = new GreetingServiceImpl();
//	}
//	
	@Test
	void sayHello() {
		System.out.println(propertyInjectedController.sayHello());
	}
}
