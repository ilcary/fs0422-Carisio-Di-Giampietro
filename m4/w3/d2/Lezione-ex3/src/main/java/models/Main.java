package models;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		//insertPerson("Mirco");
		findPerson(1);
		findPersonVotes(1);
		
	}
	
	public static void insertPerson(String name) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ex3");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        et.begin();
        
        Address a = new Address("Via Roma 1", "Milano");

        Person p = new Person(name, a);

        em.persist(p);
        et.commit();

        em.close();
        emf.close();
    }

	public static void findPerson(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ex3");
        EntityManager em = emf.createEntityManager();

        Person p = em.find(Person.class, id);
        
        if(p != null) {
        	System.out.println("*********"+p.getAddress().getCity());
        }

        em.close();
        emf.close();
    }
	
	public static void findPersonVotes(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ex3");
        EntityManager em = emf.createEntityManager();

        Person p = em.find(Person.class, id);
        
        if(p != null) {
        	for(Vote v : p.getVotes()) {
        		System.out.println("Voto di: " + p.getName() + " -> " + v.getVote());
        	}
        }

        em.close();
        emf.close();
    }
	
}
