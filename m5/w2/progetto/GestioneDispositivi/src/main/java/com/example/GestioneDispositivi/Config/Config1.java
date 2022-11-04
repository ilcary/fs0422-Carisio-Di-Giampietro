package com.example.GestioneDispositivi.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.GestioneDispositivi.Models.Device;
import com.example.GestioneDispositivi.Models.Laptop;
import com.example.GestioneDispositivi.Models.Role;
import com.example.GestioneDispositivi.Models.RoleType;
import com.example.GestioneDispositivi.Models.Smartphone;
import com.example.GestioneDispositivi.Models.StatusDev;
import com.example.GestioneDispositivi.Models.Tablet;
import com.example.GestioneDispositivi.Models.User;

@Configuration
public class Config1 {

	@Bean(name = "b1")
	@Scope("singleton")
	public User newUser1() {
		return new User().builder()
				.name("Davide")
				.username("SirDDS")
				.email("SirDDS@yahoo.ru")
				.password("1234")
				.build();
	}
	
	@Bean(name = "b2")
	@Scope("singleton")
	public User newUser2() {
		return new User().builder()
				.name("Dario")
				.username("Pyno")
				.email("Pyno@hotmail.es")
				.password("1234")
				.build();
	}
	
	@Bean(name = "b3")
	@Scope("singleton")
	public Device newTablet1() {
		return new Tablet().builder()
				.name("Samsung Tab")
				.deviceStatus(StatusDev.AVIALBE)
				.build();
				
	}
	
	@Bean(name = "b4")
	@Scope("singleton")
	public Device newLaptop1() {
		return new Laptop().builder()
				.name("Lenovo y-50")
				.deviceStatus(StatusDev.AVIALBE)
				.build();
		
	}
	
	@Bean(name = "b5")
	@Scope("singleton")
	public Device newSmartphone1() {
		return new Smartphone().builder()
				.name("Samsung S21 ultra")
				.deviceStatus(StatusDev.AVIALBE)
				.build();
		
	}
	
	 @Bean(name = "b6")
		@Scope("singleton")
	    public Role newAdminRole() {
	        return Role.builder()
	                .roleType(RoleType.ROLE_ADMIN)
	                .build();
	    }
	    
	    @Bean(name = "b7")
		@Scope("singleton")
	    public Role newUserRole() {
	        return Role.builder()
	                .roleType(RoleType.ROLE_USER)
	                .build();
	    }
	
}
