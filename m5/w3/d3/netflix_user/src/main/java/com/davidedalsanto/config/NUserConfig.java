package com.davidedalsanto.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.davidedalsanto.Service.RoleService;
import com.davidedalsanto.exceptions.RoleNotFindException;
import com.davidedalsanto.models.NUser;
import com.davidedalsanto.models.Role;
import com.davidedalsanto.models.RoleType;

@Configuration
public class NUserConfig {
		
	@Bean(name = "adminRole")
	public Role Admin() {
		return Role.builder()
				.roleType(RoleType.ROLE_ADMIN)
				.build();
	}

	
	@Bean(name = "user1")
	public NUser testUser() throws RoleNotFindException {
		
		List<Long> favIds = new ArrayList<>(Arrays.asList(1L, 2L, 3L));

		NUser u =  NUser.builder()
				.fullName("Davide")
				.username("DDS")
				.password("1234")
//				.favouritesIDs(Arrays.asList(1L, 3L, 5L))
				.build();
		u.getRoles().add(Admin());
		u.setFavouritesIDs(favIds);
		return u;
	}
}
