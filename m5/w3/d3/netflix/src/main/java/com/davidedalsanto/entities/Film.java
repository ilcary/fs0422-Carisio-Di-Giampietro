package com.davidedalsanto.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "films")
@SuperBuilder
@Builder
@NoArgsConstructor
@Getter
@Setter
public class Film extends Video{

	private int duration;
	
}
