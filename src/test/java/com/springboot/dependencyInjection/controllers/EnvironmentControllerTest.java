package com.springboot.dependencyInjection.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("QA")
@SpringBootTest
public class EnvironmentControllerTest {

	@Autowired
	EnvironmentController environmentController;
	
	@Test
	void sayHello() {
		System.out.println(environmentController.sayEnvironment());
	}
}
