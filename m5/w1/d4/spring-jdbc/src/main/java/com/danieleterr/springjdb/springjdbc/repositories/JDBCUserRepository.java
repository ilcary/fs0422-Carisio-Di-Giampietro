package com.danieleterr.springjdb.springjdbc.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.danieleterr.springjdb.springjdbc.entities.User;
import com.danieleterr.springjdb.springjdbc.rowmappers.UserRowMapper;

@Repository
public class JDBCUserRepository implements UserRepository {

	@Autowired
	private JdbcTemplate t;
	
	@Override
	public int count() {
		return t.queryForObject("SELECT COUNT(*) FROM users", Integer.class);
	}

	@Override
	public int save(User u, int addressId) {
		return t.update("INSERT INTO users (name, age, address_id) VALUES (?, ?, ?)", u.getName(), u.getAge(), addressId);
	}

	@Override
	public int update(User u) {
		return t.update("UPDATE users SET name = ?, age = ?, address_id = ? WHERE id = ?", u.getName(), u.getAge(), u.getAddress().getId(), u.getId());
	}

	@Override
	public int deleteById(int id) {
		return t.update("DELETE FROM users WHERE id = ?", id);
	}

	@Override
	public List<User> findAll() {
		return t.query("SELECT * FROM users JOIN addresses ON users.address_id = addresses.id", new UserRowMapper());
	}

	@Override
	public User findById(int id) {
		try {
			return t.queryForObject("SELECT * FROM users JOIN addresses ON users.address_id = addresses.id WHERE users.id = ?", new UserRowMapper(), id);
			
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<User> findByName(String name) {
		return t.query("SELECT * FROM users JOIN addresses ON users.address_id = addresses.id WHERE name = ?", new UserRowMapper(), name);
	}

}
