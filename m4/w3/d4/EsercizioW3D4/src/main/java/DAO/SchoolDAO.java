/*
 * 
 * addStudent( fullname, gender )
addStudentVote( idStudent, vote )
setStudentPresences( idStudent, num )
increaseStudentPresences( idStudent )
descreaseStudentPresences( idStudent )
addBadNoteToStudent( idStudent, note )
showStudentInfo( id ) -> stampa info studente, voti e media voto, presenze e tutte le eventuali note 
 */


package DAO;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Gender;
import models.Presence;
import models.Student;
import models.Vote;

public class SchoolDAO {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("EpicodeSchool");
	static EntityManager em = emf.createEntityManager();
	
	
	
	public static void closeAll() {
		em.close();
		emf.close();
	}
	
	public static void makeIstances() {
		
		EntityTransaction t = em.getTransaction();
		
		t.begin();
		
		
		Student s1 = new Student("s1", Gender.M);
		Student s2 = new Student("s2", Gender.M);
		Student s3 = new Student("s3", Gender.F);
		Student s4 = new Student("s4", Gender.F);
		
		//
		
		Vote v1 = new Vote(10, s1);
		Vote v2 = new Vote(7, s1);
		Vote v3 = new Vote(8, s1);
		Vote v4 = new Vote(5, s1);
		
		Set<Vote> votes1 = new HashSet<>();
		votes1.add(v1);
		votes1.add(v2);
		votes1.add(v3);
		votes1.add(v4);
		
		s1.setVote(votes1);
		
		//
		
		Vote v5 = new Vote(10, s2);
		Vote v6 = new Vote(7, s2);
		Vote v7 = new Vote(8, s2);
		Vote v8 = new Vote(5, s2);
		
		Set<Vote> votes2 = new HashSet<>();
		votes2.add(v5);
		votes2.add(v6);
		votes2.add(v7);
		votes2.add(v8);
		
		s2.setVote(votes2);
		
		//
		
		Vote v9 = new Vote(10, s3);
		Vote v10 = new Vote(7, s3);
		Vote v11 = new Vote(8, s3);
		Vote v12 = new Vote(5, s3);
		
		Set<Vote> votes3 = new HashSet<>();
		votes3.add(v9);
		votes3.add(v10);
		votes3.add(v11);
		votes3.add(v12);
		
		s3.setVote(votes3);
		
		//
		
		Vote v13 = new Vote(10, s4);
		Vote v14 = new Vote(7, s4);
		Vote v15 = new Vote(8, s4);
		Vote v16 = new Vote(5, s4);
		
		Set<Vote> votes4 = new HashSet<>();
		votes3.add(v13);
		votes3.add(v14);
		votes3.add(v15);
		votes3.add(v16);
		
		s4.setVote(votes4);
		
		//
		
		Presence p1 = new Presence(35, s1);
		s1.setPres(p1);
		Presence p2 = new Presence(12, s2);
		s2.setPres(p2);
		Presence p3 = new Presence(22, s3);
		s3.setPres(p3);
		Presence p4 = new Presence(40, s4);
		s4.setPres(p4);
		
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		
		t.commit();
		
		closeAll();
	}
	
	
}
