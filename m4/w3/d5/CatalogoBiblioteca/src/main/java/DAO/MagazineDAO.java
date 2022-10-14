package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Every;
import models.Magazine;

public class MagazineDAO {
	
	private static final String sus = "CatalogoBiblioteca";

	 public static void save(String title, String pubDate, int numPag, Every every) {
	        
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory(sus);
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction t = em.getTransaction();
	        
	     
	        Magazine evento = new Magazine(title, pubDate, numPag, every);
	        
	        t.begin();
	        
	        em.persist(evento);
	        
	        t.commit();
	        
	        em.close();
	        emf.close();
	        
	    }
	    
	    public static Magazine getById(int id) {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory(sus);
	        EntityManager em = emf.createEntityManager();
	        
	        Magazine e= em.find(Magazine.class, id);
	        
	        em.close();
	        emf.close();
	        
	        if(!e.equals(null))
	        return e;
	        else {
	        	System.out.println("No magazine for the boss :(");
				return null;
			}
	    }
	    
	    public static void delete(Magazine e) {
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
