package com.danieleterracciano.springcars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danieleterracciano.springcars.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
