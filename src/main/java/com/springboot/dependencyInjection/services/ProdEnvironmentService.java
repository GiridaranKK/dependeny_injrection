package com.springboot.dependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("EnvService")
public class ProdEnvironmentService implements GrettingService {

	@Override
	public String sayGreeting() {
		return "in Prod Environment";
	}

}
