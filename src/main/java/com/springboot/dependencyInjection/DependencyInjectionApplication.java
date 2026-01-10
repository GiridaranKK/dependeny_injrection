package com.springboot.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.dependencyInjection.controllers.MyController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DependencyInjectionApplication.class, args);
		ApplicationContext ctx =  SpringApplication.run(DependencyInjectionApplication.class, args);
		
		MyController controller = ctx.getBean(MyController.class);
		System.out.println("in main method");
		System.out.println(controller.sayHello());
	}

}
