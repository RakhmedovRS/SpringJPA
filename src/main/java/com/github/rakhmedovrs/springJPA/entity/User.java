package com.github.rakhmedovrs.springJPA.entity;

import java.util.StringJoiner;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author RakhmedovRS
 * @created 13-Apr-20
 */
@Entity(name = "User")
public class User
{
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String role;

	protected User()
	{
	}

	public User(String name, String role)
	{
		this.name = name;
		this.role = role;
	}

	public Long getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public String getRole()
	{
		return role;
	}

	@Override
	public String toString()
	{
		return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
			.add("id=" + id)
			.add("name='" + name + "'")
			.add("role='" + role + "'")
			.toString();
	}
}
