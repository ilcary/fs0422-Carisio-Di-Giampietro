package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import config.Configuriaml;
import models.Item;
import models.Menu;
import models.Ordine;
import models.PizzaHawaiian;
import models.PizzaMargherita;
import models.StatoOrdine;
import models.Tavolo;

@SpringBootApplication
public class GodfathersPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodfathersPizzaApplication.class, args);
		
		System.out.print("Hello world");
		
		
		Menu m = new Menu("M1");
		
		System.out.println(m);
		
		Tavolo t = new Tavolo(StatoOrdine.FREE);
		
		List<Item> comanda = new ArrayList<>();
		comanda.add(new PizzaHawaiian());
		
		Ordine ordine = new Ordine(6, StatoOrdine.BUSY, 6 , t, comanda);
		
		
		System.out.println(ordine);
		config1();
		
	}
	
	
	public static void config1() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Configuriaml.class); 
		
		Ordine ordinetty = ac.getBean("getOrdine", Ordine.class);
		PizzaMargherita pm = ac.getBean("getPizzaMargherita", PizzaMargherita.class);
		
		ordinetty.addFood(pm);
		System.out.println("ordine dal carello "+ordinetty);
		
		((AnnotationConfigApplicationContext)ac).close();
	}

}
