package models;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Student {
	
	@Id
    @Column(name = "id")
    @SequenceGenerator(
        name="id_seq_sequence",
        sequenceName="id_seq_sequence",
        initialValue = 3,
        allocationSize=1    // cache in postgre field
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator="id_seq_sequence"
    )
	private int id;
	
	private String fullname;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private Set<Vote> vote;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "presence_id", referencedColumnName = "id")
	private Presence pres;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "students_notes",
		joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "note_id")
	)
	private Set<BadNote> notes;
	
	public Student() {}
	
	public Student(String fullName, Gender g) {
		this.fullname = fullName;
		this.gender = g;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Set<Vote> getVote() {
		return vote;
	}

	public void setVote(Set<Vote> vote) {
		this.vote = vote;
	}

	public Presence getPres() {
		return pres;
	}

	public void setPres(Presence pres) {
		this.pres = pres;
	}

	public Set<BadNote> getNotes() {
		return notes;
	}

	public void setNotes(Set<BadNote> notes) {
		this.notes = notes;
	}
	
	
}
