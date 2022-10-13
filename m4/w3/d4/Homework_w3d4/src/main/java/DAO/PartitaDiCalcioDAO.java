package DAO;

import java.util.List;

//- getPartiteVinteInCasa
//- getPartiteVinteInTrasferta
//- getPartitePareggiate


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

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
	
	public static void getPartiteVinteInCasa(String squadra) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
		EntityManager em = emf.createEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<PartitaDiCalcio> cq = cb.createQuery(PartitaDiCalcio.class);
		Root<PartitaDiCalcio> p = cq.from(PartitaDiCalcio.class);
		ParameterExpression<String> param = cb.parameter(String.class);

		Predicate pd1 = cb.equal(p.get("squadra_vincente"), squadra);
		Predicate pd2 = cb.equal(p.get("squadra_casa"), squadra);

		cq.select(p).where(cb.and(pd1, pd2));

		Query q = em.createQuery(cq);
	

		List<PartitaDiCalcio> list = q.getResultList();

		for (PartitaDiCalcio person : list) {
			System.out.println(person);
		}

		em.close();
		emf.close();

		
	}
	
	public static void getPartiteVinteInTrasferta(String squadra) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
		EntityManager em = emf.createEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<PartitaDiCalcio> cq = cb.createQuery(PartitaDiCalcio.class);
		Root<PartitaDiCalcio> p = cq.from(PartitaDiCalcio.class);
		ParameterExpression<String> param = cb.parameter(String.class);

		Predicate pd1 = cb.equal(p.get("squadra_vincente"), squadra);
		Predicate pd2 = cb.equal(p.get("squadra_ospite"), squadra);

		cq.select(p).where(cb.and(pd1, pd2));

		Query q = em.createQuery(cq);
	

		List<PartitaDiCalcio> list = q.getResultList();

		for (PartitaDiCalcio person : list) {
			System.out.println(person);
		}

		em.close();
		emf.close();

		
	}
	
	public static void getPartitePareggiate(String squadra) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
		EntityManager em = emf.createEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<PartitaDiCalcio> cq = cb.createQuery(PartitaDiCalcio.class);
		Root<PartitaDiCalcio> p = cq.from(PartitaDiCalcio.class);
		ParameterExpression<String> param = cb.parameter(String.class);

		Predicate pd1 = cb.equal(p.get("squadra_vincente"), "pareggio");
		Predicate pd2 = cb.equal(p.get("squadra_casa"), squadra);
		Predicate pd3 = cb.equal(p.get("squadra_ospite"), squadra);
		Predicate pd4= cb.or(pd2,pd3);
		 

		cq.select(p).where(cb.and(pd1, pd4));

		Query q = em.createQuery(cq);
	

		List<PartitaDiCalcio> list = q.getResultList();

		for (PartitaDiCalcio person : list) {
			System.out.println(person);
		}

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
