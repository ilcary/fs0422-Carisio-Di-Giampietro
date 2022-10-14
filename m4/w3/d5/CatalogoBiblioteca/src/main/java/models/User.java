package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String LastName;

	private LocalDate dob; //date of birth

	private int card; //card number == id ? stonks : bonk
	
	@OneToMany(mappedBy="user")
	private List<Loan> prestiti = new  ArrayList<>();
	
	public User() {}

	public User(String name, String lastName, LocalDate dob) {
		this.name = name;
		LastName = lastName;
		this.dob = dob;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getCard() {
		return card;
	}

	public void setCard(int card) {
		this.card = card;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", LastName=" + LastName + ", dob=" + dob + ", card=" + card + "]";
	}
	

	
}
