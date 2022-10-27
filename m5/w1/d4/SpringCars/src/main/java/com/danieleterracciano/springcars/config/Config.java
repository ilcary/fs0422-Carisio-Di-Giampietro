package com.danieleterracciano.springcars.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.danieleterracciano.springcars.entities.Car;
import com.danieleterracciano.springcars.entities.Engine;
import com.danieleterracciano.springcars.entities.EngineType;
import com.danieleterracciano.springcars.entities.Owner;

@Configuration
public class Config {

	@Bean
	@Scope("prototype")
	public Car getCar() {
		return new Car();
	}
	
	@Bean
	@Scope("prototype")
	public Owner getOwner() {
		return new Owner();
	}
	
	@Bean
	@Scope("prototype")
	public Car getPetrolCar() {
		return Car.builder()
				.engine(getV8())
				.price(250000)
				.owner(getMuzio())
				.model("Lamborghini Gallardo")
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Car getDieselCar() {
		return Car.builder()
			.engine(getN57())
			.owner(getClaudiano())
			.price(70000)
			.model("BMW 320")
			.build();
	}
	
	@Bean
	@Scope("prototype")
	public Car getElectricCar() {
		return Car.builder()
				.engine(getOM151())
				.owner(getAureliano())
				.price(85000)
				.model("Tesla Model X")
				.build();
	}
	
	@Bean
	@Scope("prototype")
	public Owner getMuzio() {
		return Owner.builder().name("Muzio").build();
	}
	
	@Bean
	@Scope("prototype")
	public Owner getClaudiano() {
		return Owner.builder().name("Claudiano").build();
	}
	
	@Bean
	@Scope("prototype")
	public Owner getAureliano() {
		return Owner.builder().name("Aureliano").build();
	}
	
	@Bean
	@Scope("prototype")
	public Engine getV8() {
		return Engine.builder().name("V8").type(EngineType.PETROL).build();
	}
	
	@Bean
	@Scope("prototype")
	public Engine getN57() {
		return Engine.builder().name("N57").type(EngineType.DIESEL).build();
	}
	
	@Bean
	@Scope("prototype")
	public Engine getOM151() {
		return Engine.builder().name("OM151").type(EngineType.ELECTRIC).build();
	}
	
}
