package com.springboot.dependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("i18NService")
public class EnglishGreetingService implements GrettingService{

	@Override
	public String sayGreeting() {
		return "Hello friend in english";
	}

}
