package com.danieleterracciano.springcars.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieleterracciano.springcars.entities.Car;
import com.danieleterracciano.springcars.repositories.CarRepository;

@Service
public class CarService {

	@Autowired
	CarRepository cr;
	
	public void saveCar(Car c) {
		cr.save(c);
	}
	
	public List<Car> getAllCars(){
		return cr.findAll();
	}
	
	public void deleteCarById(int id) {
		cr.deleteById(id);
	}
}
