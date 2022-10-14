package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Book;

public class BookDAO {
	
	private static final String sus = "CatalogoBiblioteca";

	 public static void save( String title, String pubDate, int numPag, String author, String genre) {
	        
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory(sus);
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction t = em.getTransaction();
	        
	     
	        Book evento = new Book(title, pubDate, numPag, author, genre);
	        
	        t.begin();
	        
	        em.persist(evento);
	        
	        t.commit();
	        
	        em.close();
	        emf.close();
	        
	    }
	    
	    public static Book getById(int id) {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory(sus);
	        EntityManager em = emf.createEntityManager();
	        
	        Book e= em.find(Book.class, id);
	        
	        em.close();
	        emf.close();
	        
	        if(!e.equals(null))
	        return e;
	        else {
	        	System.out.println("No book for the boss :(");
				return null;
			}
	    }
	    
	    public static void delete(Book e) {
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
