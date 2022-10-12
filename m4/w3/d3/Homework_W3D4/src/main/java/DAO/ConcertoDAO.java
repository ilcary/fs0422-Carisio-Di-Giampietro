package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Concerto;
import models.GenereConcerto;
import models.Location;
import models.TipoEvento;

public class ConcertoDAO {
	

	public static void save( String dataevento, String descrizione, int maxpartecipanti, TipoEvento tipoEvento,
			String titolo,Location location,GenereConcerto genere_concerto, boolean in_streaming) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
     
        Concerto evento = new Concerto(dataevento, descrizione, maxpartecipanti ,tipoEvento, titolo, location,genere_concerto,in_streaming);
        
        t.begin();
        
        em.persist(evento);
        
        t.commit();
        
        em.close();
        emf.close();
		
	}
	
	public static Concerto getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        
        Concerto e= em.find(Concerto.class, id);
        
        em.close();
        emf.close();
        
		return e;
	}
	
	public static void delete(Concerto e) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
        t.begin();
        
        em.remove(e);
        
        t.commit();
        
        em.close();
        emf.close();
		
		
	}
	
	public static void refresh(Concerto e) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
		EntityManager em = emf.createEntityManager();
		
		em.refresh(e);
		
        em.close();
        emf.close();
		
	}

}
