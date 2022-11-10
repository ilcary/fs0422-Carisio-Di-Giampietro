package com.davidedalsanto.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.davidedalsanto.exceptions.RoleNotFindException;
import com.davidedalsanto.exceptions.UpdateException;
import com.davidedalsanto.models.Role;
import com.davidedalsanto.repositories.RoleRepo;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class RoleService {
	
	@Autowired
	RoleRepo rr;

	public Iterable<Role> searchAllRoles() {
		return rr.findAll();
	}

	public Page<Role> searchAllRolesPageable(Pageable p) {
		return rr.findAll(p);
	}

	public Role save(Role role) {
		return rr.save(role);
	}

	public Role findById(long id) throws RoleNotFindException {
		Role found = rr.findById(id).get();
		if (found != null) {
			return found;
		} else {
			log.error("Stai qua scemo");
			throw new RoleNotFindException();
		}
	}

	public Role update(Long id, Role role) throws Exception {
		Optional<Role> roleRes = rr.findById(id);

		if (roleRes.isPresent()) {
			Role roleUp = roleRes.get();
			roleUp.setRoleType(role.getRoleType());
			rr.save(roleUp);
			return roleUp;
		} else {
			throw new UpdateException();
		}

	}

	public void delete(long id) {
		rr.deleteById(id);
	}
}
