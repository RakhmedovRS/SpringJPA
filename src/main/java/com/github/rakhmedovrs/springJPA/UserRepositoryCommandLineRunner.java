package com.github.rakhmedovrs.springJPA;

import com.github.rakhmedovrs.springJPA.entity.User;
import com.github.rakhmedovrs.springJPA.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author RakhmedovRS
 * @created 15-Apr-20
 */
@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner
{
	private static final Logger LOGGER = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception
	{
		User user = new User("Ivan", "Admin");
		userRepository.save(user);
		LOGGER.info("New user is created " + user);
	}
}
