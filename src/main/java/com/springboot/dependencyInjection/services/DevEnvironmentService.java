package com.springboot.dependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV","default"})
@Service("EnvService")
public class DevEnvironmentService implements GrettingService {

	@Override
	public String sayGreeting() {
		return "in Dev Environment";
	}

}
