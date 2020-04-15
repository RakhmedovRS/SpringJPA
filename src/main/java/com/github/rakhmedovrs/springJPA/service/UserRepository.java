package com.github.rakhmedovrs.springJPA.service;

import com.github.rakhmedovrs.springJPA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author RakhmedovRS
 * @created 15-Apr-20
 */
public interface UserRepository extends JpaRepository<User, Long>
{
}
