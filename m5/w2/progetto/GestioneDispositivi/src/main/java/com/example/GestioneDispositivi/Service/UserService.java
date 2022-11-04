package com.example.GestioneDispositivi.Service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.GestioneDispositivi.Models.User;
import com.example.GestioneDispositivi.Repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo ur;
	
	public Iterable<User> searchAllUsers() {
		return ur.findAll();
	}
	
	public Page<User> searchAllUsersPageable(Pageable p) {
		return ur.findAll(p);
	}

	public void create(User user) {
		ur.save(user);
	}

	public User findById(long id) {
		return ur.findById(id)
				.get();
	}

		public User update(Long id, User user) throws Exception {
		Optional<User> userRes = ur.findById(id);

		if (userRes.isPresent()) {
			User userUp = userRes.get();
			userUp.setName(user.getName());
			userUp.setEmail(user.getEmail());
			ur.save(userUp);
			return userUp;
		} else {
			throw new Exception("USer non aggiornato");
		}

	}
	
	
	public void delete(long id) {
		ur.deleteById(id);
	}
}
