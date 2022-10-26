package com.example.lezione3.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.example.lezione3.beans.AnimalInfo;
import com.example.lezione3.beans.Dog;

@Configuration
@PropertySource("classpath:application.properties")
public class Conf2 {

	@Bean
	public Dog dog1() {
		Dog d = new Dog();
		d.setName("pippo");
		//d.setAnimalInfo(dog1ai());
		return d;
	}
	
	@Bean
	//@Qualifier("ai1")
	public AnimalInfo dog1ai() {
		return new AnimalInfo("Golden Retriever", 50);
	}
	
	@Bean("ai2")
	//@Qualifier("ai2")
	@Primary
	public AnimalInfo dog1ai2() {
		return new AnimalInfo("Chiwawa", 50);
	}
	
	@Bean
	public Dog dog2() {
		return null;
		
	}
}
