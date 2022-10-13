//BadNotes [ id, (increment) text ] N studenti possono avere N note, e viceversa (usare tabella di join)

package models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class BadNote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String text;
	
	@ManyToMany(mappedBy = "notes")
	private Set<Student> students;
	
	public BadNote() {}
	
	public BadNote(String txt) {
		this.text = txt;
	}
}
