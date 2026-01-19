package com.springboot.dependencyInjection.controllers;

import static org.mockito.ArgumentMatchers.contains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.dependencyInjection.services.GreetingServiceImpl;

@SpringBootTest
public class ConstructorInjectedControllerTest {
	
	@Autowired
	ConstructorInjectedController constructorInjectedController;

//	@BeforeEach
//	void setUp() {
//		constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
//	}
	
	@Test
	void sayHello() {
	System.out.println(constructorInjectedController.syaHello());
	}
}
