package com.carisiodigiampietro.lezione1.Lezione1.configs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.carisiodigiampietro.lezione1.Lezione1.components.A;
import com.carisiodigiampietro.lezione1.Lezione1.components.Address;
import com.carisiodigiampietro.lezione1.Lezione1.components.Carpentiere;
import com.carisiodigiampietro.lezione1.Lezione1.components.Student;
import com.carisiodigiampietro.lezione1.Lezione1.components.WebDeveloper;
import com.carisiodigiampietro.lezione1.Lezione1.components.Work;

@Configuration
@PropertySource("classpath:application.properties")
public class Config1 {

	@Bean
	@Scope("prototype")
	public Student getStudent() {
		return new Student();
	}
	@Value("${student2.name}")
	private String student2Name;
	
	@Bean
	public Student getStudent2() {
		return new Student(student2Name, new int[] {8, 6, 9, 10});
	}
	
	@Bean
	public Student getStudent3() {
		return new Student("Davide", new int[] {8, 6, 9, 10}, getAddress3());
	}
	
	@Bean
	public Address getAddress3() {
		return new Address("via roma");
	}
	
	@Bean
	public Student getStudent4(Address getAddress4) {
		return new Student(student2Name,getAddress4 );
	}
	
	@Bean
	public Address getAddress4() {
		return new Address("via dei tulipani");
	}
	
	@Bean
	public Student getStudent5(@Qualifier("ga5") Address address) {
		return new Student(student2Name, address );
	}
	
	@Bean
	@Qualifier("ga5")
	public Address getAddress5() {
		return new Address("via dei gerani");
	}
	
	@Bean
	public Student getStudent6(@Qualifier("carp") Work w) {
		return new Student("Peach", w );
	}
	
	@Bean("web")
	public Work getWork1() {
		return new WebDeveloper();
	}
	
	@Bean("carp")
	public Work getWork2() {
		return new Carpentiere();
	}
	
//	@Bean
//	public A getA() {
//		return new A();
//	}
	
}
