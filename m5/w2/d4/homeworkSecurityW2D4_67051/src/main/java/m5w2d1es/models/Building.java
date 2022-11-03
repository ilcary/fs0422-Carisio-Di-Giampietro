package m5w2d1es.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

// L'edificio ha un nome, un indirizzo ed una città.

@Getter
@Setter
@Entity
@Table(name = "buildings")
public class Building {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;
	private String address;
	private String city;
	
	@OneToMany(mappedBy = "building", cascade = CascadeType.ALL)
	@JsonBackReference
	private Set<Workstation> workstationSet = new HashSet<Workstation>();
	
	public Building() {
	}

	public Building(String name, String address, String city) {
		this.name = name;
		this.address = address;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Building [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + "]";
	}
	
}
