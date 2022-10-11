package database_1;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Student;

public class Main_1 {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("database_1");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction t = em.getTransaction();

	public static void main(String[] args) {
	
		//insertStudent("Rhaenyra","Targaryen","10, 6, 8, 5");
	 //	insertStudent("Laena","Velaryon","6, 7, 9, 10");
		
		findStudent(2);
		
		em.close();
		
		emf.close();

		System.out.println("here");

	}
	
	public static void findStudent(int id) {
		
		Student s = em.find(Student.class, id);
		
		if(s != null) {
			System.out.println(s);
		}
		
	}
	
	public static void insertStudent(String name, String lastname, String voti) {
			
		t.begin();
		
		Student s = new Student(name ,lastname , voti);
		
		em.persist(s);
		
		t.commit();
		
//		em.close();
//		
//		emf.close();
		
	}

}
