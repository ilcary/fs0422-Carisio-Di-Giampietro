package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Vote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int vote;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	public Vote() {}
	
	public Vote(int vote, Student student) {
		this.vote = vote;
		this.student = student;
	}
}
