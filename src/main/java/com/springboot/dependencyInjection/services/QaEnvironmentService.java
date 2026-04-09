package com.springboot.dependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("EnvService")
public class QaEnvironmentService implements GrettingService{

	@Override
	public String sayGreeting() {
		return "In Qa Environment";
	}

}
