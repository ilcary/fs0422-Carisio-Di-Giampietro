package com.example.GestioneDispositivi.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "video")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Video {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private TypeFilm type;
	private String title ;
	private String content ;
	private Double rating;
	
}
