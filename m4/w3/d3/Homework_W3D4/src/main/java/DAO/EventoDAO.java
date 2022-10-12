package DAO;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import models.Concerto;
import models.Evento;
import models.GenereConcerto;
import models.Location;
import models.TipoEvento;

public class EventoDAO {

	
	public static void save( String dataevento, String descrizione, int maxpartecipanti, TipoEvento tipoEvento,
			String titolo,Location location) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
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
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        
        Evento e= em.find(Evento.class, id);
        
        em.close();
        emf.close();
        
		return e;
	}
	
	public static void delete(Evento e) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
        t.begin();
        
        em.remove(e);
        
        t.commit();
        
        em.close();
        emf.close();
		
		
	}
	
	public static void refresh(Evento e) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
		EntityManager em = emf.createEntityManager();
		
		em.refresh(e);
		
        em.close();
        emf.close();
		
	}
	
	public static void getConcertiInStreaming(boolean is_stream) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery(
				"SELECT p FROM Evento p", Evento.class
				);
		
		List<Evento> res = q.getResultList();
		
		res.stream().filter(e -> e instanceof Concerto).map(e-> (Concerto)e).filter(e->e.isIn_streaming() == (is_stream)).collect(Collectors.toList());
		
		for(Evento e : res) {
			System.out.println(e);
		}

		em.close();
		emf.close();
	}
	
	
	public static void getConcertiPerGenere(GenereConcerto tipo_concerto) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery(
				"SELECT p FROM Evento p", Evento.class
				);
		
		List<Evento> res = q.getResultList();
		
		res.stream().filter(e -> e instanceof Concerto).map(e-> (Concerto)e).filter(e->e.getGenere_concerto().equals(tipo_concerto)).collect(Collectors.toList());
		
		for(Evento e : res) {
			System.out.println(e);
		}

		em.close();
		emf.close();
		
	}
	
	
	

	
	
}
