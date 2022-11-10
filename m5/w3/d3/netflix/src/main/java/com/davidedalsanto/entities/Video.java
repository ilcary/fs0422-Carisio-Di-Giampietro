package com.davidedalsanto.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Entity
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@NoArgsConstructor
public abstract class Video {

	@Id
	@SequenceGenerator(name = "device_seq", sequenceName = "device_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "device_seq")
	private Long id;
	
	private String title;
	
	@Enumerated(EnumType.STRING)
	private Category category;
	
	private double rating;
	
}
