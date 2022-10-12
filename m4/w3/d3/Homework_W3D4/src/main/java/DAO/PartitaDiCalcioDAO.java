package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import models.Location;
import models.PartitaDiCalcio;
import models.TipoEvento;


public class PartitaDiCalcioDAO {

	public static void save( String dataevento, String descrizione, int maxpartecipanti, TipoEvento tipoEvento,
			String titolo, Location location, String squadra_casa, String squadra_ospite, String squadra_vincente,
			int gol_casa, int gol_ospite) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
     
        PartitaDiCalcio evento = new PartitaDiCalcio(
        		dataevento, descrizione, maxpartecipanti ,tipoEvento, titolo, location,
        		squadra_casa,squadra_ospite,squadra_vincente,gol_casa,gol_ospite
        		);
        
        t.begin();
        
        em.persist(evento);
        
        t.commit();
        
        em.close();
        emf.close();
		
	}
	
	public static PartitaDiCalcio getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        
        PartitaDiCalcio e= em.find(PartitaDiCalcio.class, id);
        
        em.close();
        emf.close();
        
		return e;
	}
	
	public static void delete(PartitaDiCalcio e) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
        t.begin();
        
        em.remove(e);
        
        t.commit();
        
        em.close();
        emf.close();
		
		
	}
	
	public static void refresh(PartitaDiCalcio e) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
		EntityManager em = emf.createEntityManager();
		
		em.refresh(e);
		
        em.close();
        emf.close();
		
	}
	
}
