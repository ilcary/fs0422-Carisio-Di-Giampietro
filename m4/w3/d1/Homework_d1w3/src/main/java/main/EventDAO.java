package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Evento;

public class EventDAO {
	
	public static void save(Evento e) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_d1w3");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction t = em.getTransaction();
			t.begin();					
			em.persist(e);	
			t.commit();
			em.close();
	}
	
	public static  void getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_d1w3");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		t.begin();	
		Evento e = em.find(Evento.class, id);
		t.commit();
		
		if(e != null) {
			System.out.println(e);
		}else {
			System.out.println("utente non trovato :( ");
		}
		
	}
	
	public static  void delete(Evento e) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_d1w3");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		
		t.begin();
		em.remove(e);
		t.commit();
		em.close();
	}
	
	public void refresh(Evento e) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_d1w3");
		EntityManager em = emf.createEntityManager();
		em.refresh(e);
	}
	
}
