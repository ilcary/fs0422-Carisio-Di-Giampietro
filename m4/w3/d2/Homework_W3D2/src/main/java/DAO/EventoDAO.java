package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Evento;
import models.Location;
import models.TipoEvento;

public class EventoDAO {

	
	public static void save( String dataevento, String descrizione, int maxpartecipanti, TipoEvento tipoEvento,
			String titolo,Location location) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
     
        Evento evento = new Evento(dataevento, descrizione, maxpartecipanti ,tipoEvento, titolo, location);
        
        t.begin();
        
        em.persist(evento);
        
        t.commit();
        
        em.close();
        emf.close();
		
	}
	
	public static Evento getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
        EntityManager em = emf.createEntityManager();
        
        Evento e= em.find(Evento.class, id);
        
        em.close();
        emf.close();
        
		return e;
	}
	
	public static void delete(Evento e) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
        t.begin();
        
        em.remove(e);
        
        t.commit();
        
        em.close();
        emf.close();
		
		
	}
	
	public static void refresh(Evento e) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
		EntityManager em = emf.createEntityManager();
		
		em.refresh(e);
		
        em.close();
        emf.close();
		
	}
	
}
