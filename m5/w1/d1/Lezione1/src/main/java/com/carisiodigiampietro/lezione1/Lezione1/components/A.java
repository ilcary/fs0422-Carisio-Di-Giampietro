package com.carisiodigiampietro.lezione1.Lezione1.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class A {

	@Autowired
	private B b;
	
	@Autowired
	private C e;
	
}
