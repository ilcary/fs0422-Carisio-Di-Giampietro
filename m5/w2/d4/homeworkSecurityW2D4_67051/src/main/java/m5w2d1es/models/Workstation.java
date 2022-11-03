package m5w2d1es.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

//Ogni postazione è identificata da un codice univoco, una descrizione,
//un tipo [PRIVATO, OPENSPACE, SALA RIUNIONI], un numero massimo di occupanti ed un edificio.

@Getter
@Setter
@Entity
@Table(name = "workstations")
public class Workstation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String description;
	
	@Enumerated(EnumType.STRING)
	private WorkstationType type;
	private int maxOccupants;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonManagedReference
	private Building building;

	@OneToMany(mappedBy = "workstation")
	@JsonBackReference
	private Set<Booking> bookings = new HashSet<Booking>();
	
	public Workstation() {
	}

	public Workstation(String description, WorkstationType type, int maxOccupants) {
		this.description = description;
		this.type = type;
		this.maxOccupants = maxOccupants;
	}

	@Override
	public String toString() {
		return "Workstation [id=" + id + ", description=" + description + ", type=" + type + ", maxOccupants="
				+ maxOccupants + ", building=" + building + "]";
	}
	
	
	
}
