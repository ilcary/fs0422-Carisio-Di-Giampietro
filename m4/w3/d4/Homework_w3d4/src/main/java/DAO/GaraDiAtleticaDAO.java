package DAO;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import models.GaraDiAtletica;
import models.Location;
import models.GaraDiAtletica;
import models.Person;
import models.TipoEvento;

public class GaraDiAtleticaDAO {


	public static void save( String dataevento, String descrizione, int maxpartecipanti, TipoEvento tipoEvento,
			String titolo,Location location, String atleta_vincitore) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
     
        GaraDiAtletica evento = new GaraDiAtletica(dataevento, descrizione, maxpartecipanti ,tipoEvento, titolo, location, atleta_vincitore);
        
        t.begin();
        
        em.persist(evento);
        
        t.commit();
        
        em.close();
        emf.close();
		
	}
	
	//- getGareDiAtleticaPerVincitore(Persona vincitore)
	//- getGareDiAtleticaPerPartecipante(Persona partecipante)
	//- getEventiSoldOut [in cui il numero di partecipanti è = numeromassimopartecipanti]
	//- getEventiPerInvitato(Persona invitato) **** DIFFICILE ****
	
	
	public static void getGareDiAtleticaPerVincitore(Person vincitore) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
		EntityManager em = emf.createEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<GaraDiAtletica> cq = cb.createQuery(GaraDiAtletica.class);
		Root<GaraDiAtletica> p = cq.from(GaraDiAtletica.class);
		ParameterExpression<String> param = cb.parameter(String.class);

		Predicate pd1 = cb.equal(p.get("atleta_vincitore"), vincitore.toString());
		
		cq.select(p).where(pd1);

		Query q = em.createQuery(cq);
	

		List<GaraDiAtletica> list = q.getResultList();

		for (GaraDiAtletica person : list) {
			System.out.println(person);
		}

		em.close();
		emf.close();
	}
	
	public static void getGareDiAtleticaPerPartecipante(Person partecipante) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
		EntityManager em = emf.createEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<GaraDiAtletica> cq = cb.createQuery(GaraDiAtletica.class);
		Root<GaraDiAtletica> p = cq.from(GaraDiAtletica.class);
		ParameterExpression<Person> param = cb.parameter(Person.class);

		Predicate pd1 = cb.equal(p.get("set_atleti"), param);
		
		Join<GaraDiAtletica, Person> part = p.join("set_atleti", JoinType.LEFT);
		
		cq.select(part.get("name")).where(pd1);

		Query q = em.createQuery(cq);
		
		q.setParameter(param, partecipante);
	

		List<GaraDiAtletica> list = q.getResultList();

		for (GaraDiAtletica person : list) {
			System.out.println(person);
		}

		em.close();
		emf.close();
	}
	
	public static GaraDiAtletica getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        
        GaraDiAtletica e= em.find(GaraDiAtletica.class, id);
        
        em.close();
        emf.close();
        
		return e;
	}
	
	public static void delete(GaraDiAtletica e) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
        t.begin();
        
        em.remove(e);
        
        t.commit();
        
        em.close();
        emf.close();
		
		
	}
	
	public static void refresh(GaraDiAtletica e) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
		EntityManager em = emf.createEntityManager();
		
		em.refresh(e);
		
        em.close();
        emf.close();
		
	}
	
}
