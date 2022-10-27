package com.danieleterr.springjdb.springjdbc.repositories;

import java.util.List;

import com.danieleterr.springjdb.springjdbc.entities.User;

public interface UserRepository {

	public int count();
	public int save(User u, int addressId);
	public int update(User u);
	public int deleteById(int id);
	public List<User> findAll();
	public User findById(int id);
	public List<User> findByName(String name);
	
}
