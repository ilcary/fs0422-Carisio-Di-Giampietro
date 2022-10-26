package com.example.lezione3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.lezione3.beans.Dog;
import com.example.lezione3.components.School;
import com.example.lezione3.config.Conf2;

@SpringBootApplication
public class Lezione3Application {

	public static void main(String[] args) {
		SpringApplication.run(Lezione3Application.class, args);
		config1();
		//config2();
	}
	
	public static void config1() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.example.lezione3.components");
		ctx.refresh();
		
		School s = ctx.getBean("sc", School.class);
		System.out.println(s);
		
		ctx.close();
		
	}
	
	public static void config2() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Conf2.class);
		
		Dog d1 = ctx.getBean("dog1", Dog.class);
		System.out.println("d1 name: " +d1.getName());
		System.out.println("d1 ai: " + d1.getAnimalInfo().getBreed());
		
		ctx.close();
	}

}
