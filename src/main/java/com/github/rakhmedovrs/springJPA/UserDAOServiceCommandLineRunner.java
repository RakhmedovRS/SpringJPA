package com.github.rakhmedovrs.springJPA;

import com.github.rakhmedovrs.springJPA.entity.User;
import com.github.rakhmedovrs.springJPA.service.UsedDAOService;
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
public class UserDAOServiceCommandLineRunner implements CommandLineRunner
{
	private static final Logger LOGGER = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

	@Autowired
	private UsedDAOService usedDAOService;

	@Override
	public void run(String... args) throws Exception
	{
		User user = new User("Ivan", "Admin");
		usedDAOService.insert(user);
		LOGGER.info("New user is created " + user);
	}
}
