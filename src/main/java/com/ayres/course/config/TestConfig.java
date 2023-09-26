package com.ayres.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ayres.course.entities.User;
import com.ayres.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Lucas", "Lucas@xd.com", "123456790", "123");
		User u2 = new User(null, "Mari", "Mari@xd.com", "123444", "1234WW");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}
