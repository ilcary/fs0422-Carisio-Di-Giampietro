package com.example.demo.config;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.example.demo.classes.Address;
import com.example.demo.classes.Gender;
import com.example.demo.classes.JavaStudent;
import com.example.demo.classes.ReactStudent;
import com.example.demo.classes.Topic;

@Configuration
@PropertySource("classpath:application.properties")
public class Config_ {

	@Bean
	@Scope("prototype")
	public JavaStudent getJavaStudent() {
		return new JavaStudent("Mario", Gender.MALE, 
				Arrays.asList(
						topicSpring(),
						topicJPA()
				), 
				getAddress(ar()),9.8 );
	}
	
	@Bean
	@Scope("prototype")
	public ReactStudent getReactStudent() {
		return new ReactStudent("Maria", Gender.FEMALE, 
				Arrays.asList(
					topicHooks(),
					topicRedux()
				), getAddress(ar()),8.9 );
	}
	
	@Bean
	public Topic topicSpring() { Topic topic = new Topic(); topic.setName("spring"); return topic; }
	
	@Bean
	public Topic topicJPA() { return new Topic("JPA"); }
	
	@Bean
	public Topic topicHooks() { return new Topic("Hooks"); }
	
	@Bean
	public Topic topicRedux() { return new Topic("Redux"); }
	
	@Bean
	public String ar() {return "via terza 3";}
	private String aCity = "Napoli";
	@Bean
	@Scope("prototype")
	public Address getAddress(String aRoad) {
		return new Address(aRoad, aCity);
	}
	
}
