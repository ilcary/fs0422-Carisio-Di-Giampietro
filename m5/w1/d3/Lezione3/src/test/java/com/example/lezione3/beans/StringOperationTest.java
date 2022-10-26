package com.example.lezione3.beans;

import static org.junit.Assert.*;

import java.util.Collection;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.example.lezione3.classes.StringOperations;

@RunWith(Parameterized.class)
public class StringOperationTest {

	private String p;
	private int l;
	
	public StringOperationTest(String p, int l) {
		this.p = p;
		this.l = l;
	}

	@Parameters
	public static Collection params() {
		return Arrays.asList(new Object[][] {
			{"sus",6},
			{"angelo",12},
			{"lino",5496},
			{"popi",2}
		});
	}
	
	
	@Test
	public void test() {
		StringOperations so = new StringOperations(p);
		assertEquals(l, so.getLenght());
	}

}
