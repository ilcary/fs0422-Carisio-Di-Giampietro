package com.carisiodigiampietro.lezione1.Lezione1.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@PropertySource("classpath:application.properties")
@ToString
public class B {
	
	@Value("${b.v1}")
	private String v1;
	
}
