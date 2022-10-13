package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Presence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int numPres;
	
	@OneToOne(mappedBy = "pres")
	private Student student;
	
	public Presence() {}
	
	public Presence(int numPres, Student student) {
		this.numPres = numPres;
		this.student = student;
	}
}
