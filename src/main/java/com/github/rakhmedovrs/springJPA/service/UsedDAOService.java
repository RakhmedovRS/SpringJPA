package com.github.rakhmedovrs.springJPA.service;

import com.github.rakhmedovrs.springJPA.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * @author RakhmedovRS
 * @created 13-Apr-20
 */
@Repository
@Transactional
public class UsedDAOService
{
	@PersistenceContext
	private EntityManager entityManager;

	public Long insert(User user)
	{
		entityManager.persist(user);
		return user.getId();
	}
}
