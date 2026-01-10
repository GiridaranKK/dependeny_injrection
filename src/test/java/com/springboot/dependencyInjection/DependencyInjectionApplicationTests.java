package com.springboot.dependencyInjection;

import static org.mockito.ArgumentMatchers.contains;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.springboot.dependencyInjection.controllers.MyController;

@SpringBootTest
class DependencyInjectionApplicationTests {
	
	@Autowired
	ApplicationContext applicationContext;
	
	@Autowired
	MyController controller;
	
	@Test
	void testAutowireOfController() {
		System.out.println(controller.sayHello());
	}
	
	@Test
	void testFetControllerFromCtx() {
		MyController controller = applicationContext.getBean(MyController.class);
		System.out.println(controller.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
