package com.danieleterracciano.springcars;

import java.lang.reflect.Array;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.danieleterracciano.springcars.config.Config;
import com.danieleterracciano.springcars.entities.Car;
import com.danieleterracciano.springcars.entities.Engine;
import com.danieleterracciano.springcars.entities.EngineType;
import com.danieleterracciano.springcars.entities.Owner;
import com.danieleterracciano.springcars.services.CarService;

@SpringBootApplication
public class SpringCarsApplication implements CommandLineRunner{

//	Le entità sono:
//		Car (id, model, price, Engine, Owner)
//		Engine(id, name, type)
//		Owner(id, name)
//
//		Tramite configurazione di Beans, creare 3 utenti che hanno 3 macchine (con valori a piacere)
//
//		Creare gli appositi repository e service per mappare le entità.
//
//		Nel main, creare un menù:
//		1 - mostra i dati di tutte le macchine nello show room
//		2 - cancella macchina per id (passato da utente)
//		3 - inserisci nuova macchina (non da utente)
	
	@Autowired
	CarService cs;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCarsApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
		
//		cs.saveCar(c1);
//		cs.saveCar(c2);
//		cs.saveCar(c3);
		
		
		
		
		
	}
	
	public List<Car> getAllCars(){
		return cs.getAllCars();
	}
	
	public void saveCar(Car c) {
		cs.saveCar(c);
	}
	
	public void deleteCar(int id) {
		cs.deleteCarById(id);
	}
	
	public static Car[] config() {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		Car lamborghini = ctx.getBean("getPetrolCar", Car.class);
		Car bmw = ctx.getBean("getDieselCar", Car.class);
		Car tesla = ctx.getBean("getElectricCar", Car.class);
		
		((AnnotationConfigApplicationContext) ctx).close();
		
		return new Car[] {lamborghini, bmw, tesla};
	}


}
