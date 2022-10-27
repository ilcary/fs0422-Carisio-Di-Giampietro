package com.davidedalsanto.cheat.configs;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.davidedalsanto.cheat.entities.Address;
import com.davidedalsanto.cheat.entities.Alimentazioni;
import com.davidedalsanto.cheat.entities.Car;
import com.davidedalsanto.cheat.entities.Engine;
import com.davidedalsanto.cheat.entities.Owner;

@Configuration
public class OwnerConfig {
	
	@Bean
	@Scope("prototype")
	public Address carisioAddress() {
		return new Address("Avezzano", "Via carisio");
	}

	
	@Bean
	@Scope("prototype")
	public Engine carisioEngine() {
		return new Engine(Alimentazioni.DIESEL, 2200);
	}
	
	@Bean
	@Scope("prototype")
	public Car carisioCar() {
		return new Car(carisioEngine());
	}

	@Bean
	@Scope("prototype")
	public Owner makeCarisio() {
		return new Owner("Carisio", carisioCar() , carisioAddress());
	}
}
