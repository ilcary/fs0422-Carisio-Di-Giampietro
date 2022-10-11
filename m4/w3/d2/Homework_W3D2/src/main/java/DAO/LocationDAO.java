package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Gender;
import models.Location;
import models.Person;

public class LocationDAO {

	
	
	public static void save(String nome, String citta) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
     
        Location person = new Location(nome, citta);
        
        t.begin();
        
        em.persist(person);
        
        t.commit();
        
        em.close();
        emf.close();
		
	}
	
	public static Location getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
        EntityManager em = emf.createEntityManager();
        
        Location l= em.find(Location.class, id);
        
        em.close();
        emf.close();
        
		return l;
	}
	
	public static void delete(Location l) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
        t.begin();
        
        em.remove(l);
        
        t.commit();
        
        em.close();
        emf.close();
		
		
	}
	
	public static void refresh(Location l) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
		EntityManager em = emf.createEntityManager();
		
		em.refresh(l);
		
        em.close();
        emf.close();
		
	}
	
	
}
