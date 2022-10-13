package DAO;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import models.GaraDiAtletica;
import models.Gender;

import models.Person;

//- save
//- getById
//- delete
//- refresh

public class PersonaDAO {
	
	public static void corri(Person p, GaraDiAtletica g ) {
		
//		public static void updatePersonById(int id, String newName) {
//			
//			Query q = em.createQuery(
//					"UPDATE Person p SET name = :n WHERE p.id = :id"
//					);
//			
//			t.begin();	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
     
        
        t.begin();
        g.setSet_atleti(p);
        t.commit();
        em.close();
        emf.close();
	}
	
//	 public void addPhone(Phone phone) {
//	        if (!getPhones().contains(phone)) {
//	            getPhones().add(phone);
//	            if (phone.getProfessor() != null) {
//	                phone.getProfessor().getPhones().remove(phone);
//	            }
//	            phone.setProfessor(this);
//	        }
//	    }
	

	
	public static void save(String name, String lastname, String email, String birthday, Gender gender) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
     
        Person person = new Person(name, lastname, email, birthday, gender);
        
        t.begin();
        
        em.persist(person);
        
        t.commit();
        
        em.close();
        emf.close();
		
	}
	
	public static Person getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        
        Person p= em.find(Person.class, id);
        
        em.close();
        emf.close();
        
		return p;
	}
	
	public static void delete(Person p) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
        t.begin();
        
        em.remove(p);
        
        t.commit();
        
        em.close();
        emf.close();
		
		
	}
	
	public static void refresh(Person p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
		EntityManager em = emf.createEntityManager();
		
		em.refresh(p);
		
        em.close();
        emf.close();
		
	}

}
