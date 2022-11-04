package com.example.GestioneDispositivi.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.GestioneDispositivi.Models.Role;
import com.example.GestioneDispositivi.Repository.RoleRepo;


@Service
public class RoleService {

	@Autowired
	RoleRepo rr;
	
	public Iterable<Role> searchAllRoles(){
		return rr.findAll();
	}
	
	public Page<Role> searchAllUsersPageable(Pageable p){
		return rr.findAll(p);
	}
	
	public void create(Role user) {
		rr.save(user);
	}

	public Role findById(long id) {
		return rr.findById(id)
				.get();
	}

		public Role update(Long id, Role role) throws Exception {
		Optional<Role> roleRes = rr.findById(id);

		if (roleRes.isPresent()) {
			Role roleUp = roleRes.get();
			roleUp.setRoleType(role.getRoleType());
			rr.save(roleUp);
			return roleUp;
		} else {
			throw new Exception("failed to update role");
		}

	}
	
	
	public void delete(long id) {
		rr.deleteById(id);
	}
	
}
