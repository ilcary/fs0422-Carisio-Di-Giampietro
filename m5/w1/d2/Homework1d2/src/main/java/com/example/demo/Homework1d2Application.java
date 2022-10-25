package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.classes.JavaStudent;
import com.example.demo.classes.ReactStudent;
import com.example.demo.config.Config_;

@SpringBootApplication
public class Homework1d2Application {

	public static void main(String[] args) {
		SpringApplication.run(Homework1d2Application.class, args);
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config_.class); 
		
		JavaStudent js1 =  ac.getBean("getJavaStudent", JavaStudent.class);
		js1.hello();
		System.out.println( "js1 topics: " + js1.getTopics() );
		System.out.println( js1.getAddress() );
		
		ReactStudent rs1 = ac.getBean("getReactStudent", ReactStudent.class);
		rs1.hello();
		System.out.println( "rs1 topics: " + rs1.getTopics() );
		System.out.println( rs1.getAddress() );
		
		((AnnotationConfigApplicationContext)ac).close();
		
	}
	
	public static void config() {
		
	}

}
