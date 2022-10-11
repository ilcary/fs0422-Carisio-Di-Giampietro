package models;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	
	private String name;
	private String lastname;
	private String email;
	private String birthday;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	//private List<Partecipazione> inizialmente =  new List<>();
	@OneToMany(mappedBy="person")
	private List<Partecipazione> partecipazioni = new ArrayList<>() ;
	
	public Person() {}

	public Person(String name, String lastname, String email, String birthday, Gender gender) {
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.birthday = birthday;
		this.gender = gender;
		this.partecipazioni=partecipazioni ;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Partecipazione> getPartecipazioni() {
		return partecipazioni;
	}

	public void setPartecipazioni(List<Partecipazione> partecipazioni) {
		this.partecipazioni = partecipazioni;
	};
	
	@Override
	public String toString() {
		return this.name+" "+this.lastname;
	}
	
	
}
