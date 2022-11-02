package com.danieleterr.springjpa.springjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.danieleterr.springjpa.springjpa.entities.Address;
import com.danieleterr.springjpa.springjpa.entities.User;
import com.danieleterr.springjpa.springjpa.services.UserService;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

	@Autowired
	UserService us;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
		System.out.println("hello");


	}

	@Override
	public void run(String... args) throws Exception {


	}

}
