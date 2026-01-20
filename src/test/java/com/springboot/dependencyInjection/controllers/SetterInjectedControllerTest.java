package com.springboot.dependencyInjection.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.dependencyInjection.services.GreetingServiceImpl;

@SpringBootTest
public class SetterInjectedControllerTest {
	
	@Autowired
	SetterInjectedController setterInjectedController;

//	@BeforeEach
//	void setUp() {
//		setterInjectedController = new SetterInjectedController();
//		//setterInjectedController.setGrettingService(new GreetingServiceImpl()); - if this line not there gives nullpointerexception
//		setterInjectedController.setGrettingService(new GreetingServiceImpl());
//	}
	
	@Test
	void sayHello() {
	System.out.println(setterInjectedController.sayHello());
	}
}
