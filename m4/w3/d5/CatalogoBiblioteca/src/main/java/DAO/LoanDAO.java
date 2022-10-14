package DAO;



import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;


import models.Item;
import models.Loan;
import models.User;

public class LoanDAO {

	private static final String sus = "CatalogoBiblioteca";

	 public static void save(User user, Item itemLoaned) {
	        
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory(sus);
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction t = em.getTransaction();
	        
	     
	        Loan evento = new Loan(user, itemLoaned);
	        
	        t.begin();
	        
	        em.persist(evento);
	        
	        t.commit();
	        
	        em.close();
	        emf.close();
	        
	    }
	    
	    public static Loan getById(int id) {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory(sus);
	        EntityManager em = emf.createEntityManager();
	        
	        Loan e= em.find(Loan.class, id);
	        
	        em.close();
	        emf.close();
	        
	        if(!e.equals(null))
	        return e;
	        else {
	        	System.out.println("No loan for the boss :(");
				return null;
			}
	    }
	    
	    public static void delete(Loan e) {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory(sus);
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction t = em.getTransaction();
	        
	        t.begin();
	        
	        em.remove(e);
	        
	        t.commit();
	        
	        em.close();
	        emf.close();
	        
	        
	    }
	    
	    
	    public static void endLoan(Loan loan) {
	    	
	    	
	    	if(loan.getState()) {
	    				System.out.println("The loan has been alredy settled");
	    	}
	    	else {
				
	    		EntityManagerFactory emf = Persistence.createEntityManagerFactory(sus);
	    		EntityManager em = emf.createEntityManager();
	    		EntityTransaction t = em.getTransaction();
	    		CriteriaBuilder cb = em.getCriteriaBuilder();
	    		t.begin();
	    		
	    		// create update
	    		CriteriaUpdate<Loan> update = cb.
	    				createCriteriaUpdate(Loan.class);
	    		
	    		// set the root class
	    		Root e = update.from(Loan.class);
	    		
	    		// set update and where clause
	    		update.set("state", true);
	    		update.set("actualReturnDate", LocalDateTime.now());
	    		update.where(cb.equal(e.get("id"), loan.getId()));
	    		
	    		// perform update
	    		em.createQuery(update).executeUpdate();
	    		
	    		em.flush();
	    		t.commit();
	    		
	    		em.close();
	    		emf.close();	
	    		
	    		System.out.println("The loan has been settled");
			}
	    }
	
}
