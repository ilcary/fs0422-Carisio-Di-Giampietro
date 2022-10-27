package com.danieleterr.springjdb.springjdbc.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.danieleterr.springjdb.springjdbc.entities.Address;

public class AddressRowMapper implements RowMapper<Address>{

	@Override
	public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
		Address a = new Address(rs.getString("road"));
		a.setId(rs.getInt("address_id"));
		
		return a;
	}

}
