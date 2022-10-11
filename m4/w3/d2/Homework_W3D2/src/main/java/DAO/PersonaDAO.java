package DAO;

import java.util.Collections;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Evento;
import models.Gender;
import models.Location;
import models.Partecipazione;
import models.Person;
import models.TipoEvento;

//- save
//- getById
//- delete
//- refresh

public class PersonaDAO {
	
	
	
	public static void save(String name, String lastname, String email, String birthday, Gender gender) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
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
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
        EntityManager em = emf.createEntityManager();
        
        Person p= em.find(Person.class, id);
        
        em.close();
        emf.close();
        
		return p;
	}
	
	public static void delete(Person p) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
        t.begin();
        
        em.remove(p);
        
        t.commit();
        
        em.close();
        emf.close();
		
		
	}
	
	public static void refresh(Person p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
		EntityManager em = emf.createEntityManager();
		
		em.refresh(p);
		
        em.close();
        emf.close();
		
	}

}
