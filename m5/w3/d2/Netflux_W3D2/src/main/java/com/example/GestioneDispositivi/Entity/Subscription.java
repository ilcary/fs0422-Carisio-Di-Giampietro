package com.example.GestioneDispositivi.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Subscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@OneToOne(mappedBy = "user")
	private User user;
	
	private LocalDate initialData;
	private LocalDate expiringDate;
	private typeSub type;
	
}
