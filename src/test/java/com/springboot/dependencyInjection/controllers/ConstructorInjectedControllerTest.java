package com.springboot.dependencyInjection.controllers;

import static org.mockito.ArgumentMatchers.contains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springboot.dependencyInjection.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController constructorInjectedController;

	@BeforeEach
	void setUp() {
		constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test
	void sayHello() {
	System.out.println(constructorInjectedController.syaHello());
	}
}
