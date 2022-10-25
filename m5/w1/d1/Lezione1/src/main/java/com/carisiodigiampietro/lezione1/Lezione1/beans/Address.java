package com.carisiodigiampietro.lezione1.Lezione1.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Address {

	private String road;
	private City city;
	
	public Address(String road) {
		this.road=road;
	}
	
}
