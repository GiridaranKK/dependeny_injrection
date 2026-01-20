package com.springboot.dependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("EnvService")
public class UatEnvironmentService implements GrettingService {

	@Override
	public String sayGreeting() {
		return "in UAT Environment";
	}

}
