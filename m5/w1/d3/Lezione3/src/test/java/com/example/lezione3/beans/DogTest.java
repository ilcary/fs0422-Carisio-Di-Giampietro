package com.example.lezione3.beans;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {

	@Test
	public void test() {

		Dog d1 = new Dog();
		AnimalInfo ai =  new AnimalInfo("pitbull", 10);
		d1.setAnimalInfo(ai);
		assertTrue("il prezzo del cane è maggiore di 100?", d1.getAnimalInfo().getPrice()>100);
	}

}
