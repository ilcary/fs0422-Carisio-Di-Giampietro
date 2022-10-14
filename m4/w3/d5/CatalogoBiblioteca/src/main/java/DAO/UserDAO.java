package DAO;


import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import models.User;

public class UserDAO {
	
	private static final String sus = "CatalogoBiblioteca";

	 public static void save(String name, String lastName, LocalDate dob) {
	        
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory(sus);
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction t = em.getTransaction();
	        
	     
	        User user = new User(name, lastName, dob);
	        
	        t.begin();
	        
	        em.persist(user);
	        user.setCard(user.getId());
	        
	        t.commit();
	        
	        em.close();
	        emf.close();
	        
	    }
	    
	    public static User getById(int id) {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory(sus);
	        EntityManager em = emf.createEntityManager();
	        
	        User e= em.find(User.class, id);
	        
	        em.close();
	        emf.close();
	        
	        if(!e.equals(null))
	        return e;
	        else {
	        	System.out.println("No user for the boss :(");
				return null;
			}
	    }
	    
	    public static void delete(User e) {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory(sus);
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction t = em.getTransaction();
	        
	        t.begin();
	        
	        em.remove(e);
	        
	        t.commit();
	        
	        em.close();
	        emf.close();
	        
	        
	    }

}
