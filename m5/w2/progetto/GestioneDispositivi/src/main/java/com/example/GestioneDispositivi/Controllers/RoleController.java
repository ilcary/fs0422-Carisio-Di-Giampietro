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

import com.example.GestioneDispositivi.Models.Role;
import com.example.GestioneDispositivi.Service.RoleService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/roles")
public class RoleController {

	@Autowired
	private RoleService rs;
	
	@GetMapping("")
	public Iterable<Role> searchAllRoles() {
		return rs.searchAllRoles();
	}
	
	@GetMapping("/pageable")
	public ResponseEntity<Page<Role>> findAll(Pageable p) {
		Page<Role> findAll = rs.searchAllUsersPageable(p);

		if (findAll.hasContent()) {
			return new ResponseEntity<>(findAll, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}

	}
	
	@PostMapping("")
	public void create(@RequestBody Role role) {
		try {
			rs.create(role);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	@GetMapping("/{id}")
	public Role readById(@PathVariable Long id) {
		try {
			return rs.findById(id);
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}

	@PutMapping("")
	public void update(@RequestBody Role role) {
		try {
			rs.update(role.getId(), role);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		try {
			rs.delete(id);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
	
}
