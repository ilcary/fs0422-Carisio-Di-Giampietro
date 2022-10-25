package com.example.demo.classes;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class CalcTest {

	Calc c = new Calc();
	
	@Test
	public void testSum() {
		assertEquals("la somma dovrebbe essere 10", c.sum(5, 5),10);
	}
	
	@Test
	//@Ignore
	public void testDiff() {
		assertEquals("la differenza dovrebbe essere 1", c.diff(5, 4),10);
	}

	@Test
	public void test_1() {
		String s = "ciao";
		String s2 = "ciao";
		assertSame("senza costruttore s e s2 dovrebbero essere identici",s, s2);
	}
	
	@Test
	//@Ignore // annotazione per saltare i test con dei failure
	public void test_2() {
		String s = new String("ciao") ;
		String s2 = new String("ciao");
		assertSame("con il costruttore s e s2 dovrebbero essere identici",s, s2);
	}

}
