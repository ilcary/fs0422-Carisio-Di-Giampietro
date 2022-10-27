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
public class SpringJpaApplication implements CommandLineRunner{

	@Autowired
	UserService us;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
//		insertUser(User.builder().name("Ciro").age(15).address(new Address("via Ciro")).build());
//		insertUser(User.builder().name("Gino").age(25).address(new Address("via Gino")).build());
//		insertUser(User.builder().name("Pino").age(35).address(new Address("via Pino")).build());
		
		//printAllUsers();
		System.out.println("Gli utenti di nome Ciro sono: " + getUsersByName("Ciro"));
		
	}

	public void insertUser(User u) {
		us.addUser(u);
	}
	public void printAllUsers() {
		System.out.println("Tutti gli utenti: " + us.getAll());
	}
	
	public List<User> getUsersByName(String s){
		return us.getByName(s);
	}
}
