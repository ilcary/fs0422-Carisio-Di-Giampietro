package com.example.demo.classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoxTest {
	
	Box b = new Box();
	
	@Before
	public void beforeAllTests() {
		b.setX(6);
		b.setY(2);
		b.setName("scatoletty");
	}

	@Test
	public void testArea() {
		System.out.println("ciao");
		assertEquals("l'area dovrebbe essere 12",b.area(), 20);
	}
	
	@Test
	public void testName() {
		assertEquals("il nome dovrebbe essere scatoletty", b.getName(), "boxetty");
	}

}
