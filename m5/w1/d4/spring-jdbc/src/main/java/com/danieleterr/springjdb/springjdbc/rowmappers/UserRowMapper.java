package com.danieleterr.springjdb.springjdbc.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.danieleterr.springjdb.springjdbc.entities.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User u = User.builder()
				.id(rs.getInt("id"))
				.name(rs.getString("name"))
				.age(rs.getInt("age"))
				.address(new AddressRowMapper().mapRow(rs, rowNum))
				.build();
		return u;
	}

	
}
