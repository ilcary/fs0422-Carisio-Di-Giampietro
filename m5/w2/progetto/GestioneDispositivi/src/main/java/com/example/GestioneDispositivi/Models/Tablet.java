package com.example.GestioneDispositivi.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Entity
@Builder
@Data
@NoArgsConstructor
@Table(name = "tablet")
public class Tablet extends Device {


}
