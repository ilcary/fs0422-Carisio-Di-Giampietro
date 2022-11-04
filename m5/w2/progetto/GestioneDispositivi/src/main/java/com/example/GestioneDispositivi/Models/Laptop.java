package com.example.GestioneDispositivi.Models;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Entity
@Builder
@Data
@NoArgsConstructor
@Table(name = "laptop")
public class Laptop extends Device {
	
}
