package com.example.demo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.classes.CalcTest;

@SpringBootApplication
public class Lezione2Application {

	public static void main(String[] args) {
		SpringApplication.run(Lezione2Application.class, args);
		
		calcTest();
		
	}
	
	public static void calcTest() {
		
		Result r = JUnitCore.runClasses(CalcTest.class);
		
		for(Failure f : r.getFailures()) {
			System.out.println(f);
		}
		System.out.println("tutti i test sono passati? "+ r.wasSuccessful() );
		
		
	}

}
