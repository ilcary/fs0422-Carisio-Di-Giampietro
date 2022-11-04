package com.example.GestioneDispositivi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GestioneDispositivi.Models.User;
import com.example.GestioneDispositivi.Service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService us;
	

	@GetMapping("")
	public Iterable<User> searchAllUsers() {
		return us.searchAllUsers();
	}
	
	@GetMapping("/pageable")
	public ResponseEntity<Page<User>> findAll(Pageable p) {
		Page<User> findAll = us.searchAllUsersPageable(p);

		if (findAll.hasContent()) {
			return new ResponseEntity<>(findAll, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}

	}

	@PostMapping("")
	public void create(@RequestBody User user) {
		try {
			us.create(user);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	@GetMapping("/{id}")
	public User readById(@PathVariable Long id) {
		try {
			return us.findById(id);
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}

	@PutMapping("")
	public void update(@RequestBody User user) {
		try {
			us.update(user.getId(), user);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		try {
			us.delete(id);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
	
}
