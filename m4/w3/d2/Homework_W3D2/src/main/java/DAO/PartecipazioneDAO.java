package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import models.Evento;
import models.Gender;
import models.Partecipazione;
import models.Person;
import models.StatoPartecipazione;

public class PartecipazioneDAO {

	

	public static void save(Person person, Evento evento, StatoPartecipazione stato_partecipazione) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
     
        Partecipazione p = new Partecipazione(person, evento,stato_partecipazione );
        
        t.begin();
        
        em.persist(p);
        
        t.commit();
        
        em.close();
        emf.close();
		
	}
	
	public static Partecipazione getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
        EntityManager em = emf.createEntityManager();
        
        Partecipazione p= em.find(Partecipazione.class, id);
        
        em.close();
        emf.close();
        
		return p;
	}
	
	public static void delete(Partecipazione p) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
        t.begin();
        
        em.remove(p);
        
        t.commit();
        
        em.close();
        emf.close();
		
		
	}
	
	public static void refresh(Partecipazione p) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D2");
		EntityManager em = emf.createEntityManager();
		
		em.refresh(p);
		
        em.close();
        emf.close();
		
	}
	
	
}
