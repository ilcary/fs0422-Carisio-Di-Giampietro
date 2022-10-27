package com.danieleterr.springjdb.springjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.danieleterr.springjdb.springjdbc.entities.User;
import com.danieleterr.springjdb.springjdbc.repositories.JDBCAddressRepository;
import com.danieleterr.springjdb.springjdbc.repositories.JDBCUserRepository;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner{

	@Autowired
	JDBCUserRepository ur;
	
	@Autowired
	JDBCAddressRepository ar;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
//		insert("Mario Rossi", 5, 1);
//		insert("Luigi Verdi", 7, 2);
		System.out.println("Il numero di utenti correntemente salvato è: " + ur.count());
//		insertAddress("Via ciaone");
//		insertAddress("Via ciaone a te");
		findAll();
		findById(10);
		//User u = ur.findById(1);
		//updateUser(u, "Gianni", 9);
		//deleteUser(1);
		System.out.println("Gli utenti di nome Luigi Verdi sono" + findByName("Luigi Verdi") );
	}
	
	public void insert(String name, int age, int addressId) {
		User u = User.builder().name(name).age(age).build();
		ur.save(u, addressId);
	}
	
	public void findAll() {
		for(int i = 0; i < ur.findAll().size(); i++) {
			System.out.println("user: " + ur.findAll().get(i));
		}
	}
	
	public void insertAddress(String road) {
		ar.save(road);
	}

	public void findById(int id) {
		System.out.println(String.format("L'utente con id %d è %s", id, ur.findById(id)));
	}
	
	public void updateUser(User u, Object...objs) {
		u.setName((String)objs[0]);
		u.setAge((int)objs[1]);
		ur.update(u);
	}
	
	public void deleteUser(int id) {
		ur.deleteById(id);
	}
	
	public List<User> findByName(String n) {
		return ur.findByName(n);
	}
}
