package com.danieleterr.springjdb.springjdbc.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCAddressRepository implements AddressRepository{

	@Autowired
	private JdbcTemplate t;
	
	@Override
	public int save(String r) {
		return t.update("INSERT INTO addresses (road) VALUES (?)", r);
	}

}
