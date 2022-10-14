package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import models.Book;
import models.Item;
import models.Loan;
import models.User;

public class ArchiveDAO {

	private static final String sus = "CatalogoBiblioteca";

	public static void findByPubYear(String pubDate) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(sus);
		EntityManager em = emf.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Item> cq = cb.createQuery(Item.class);
		Root<Item> p = cq.from(Item.class);
		ParameterExpression<String> param = cb.parameter(String.class);

		Predicate pd1 = cb.equal(p.get("pub_date"), param);

		cq.select(p).where(pd1);

		try {
			Query q = em.createQuery(cq);

			q.setParameter(param, pubDate);

			List<Item> itemByYear = q.getResultList();

			if (itemByYear.size() != 0)
				for (Item i : itemByYear) {
					System.out.println(i);
				}
			else {
				System.out.println("in the year " + pubDate + " there aren't books or magazines");
			}
		} finally {
			em.close();
			emf.close();
		}

	}

	public static void findByAuthor(String author) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(sus);
		EntityManager em = emf.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Book> cq = cb.createQuery(Book.class);
		Root<Book> p = cq.from(Book.class);
		ParameterExpression<String> param = cb.parameter(String.class);

		Predicate pd1 = cb.equal(p.get("author"), param);

		cq.select(p).where(pd1);

		try {
			Query q = em.createQuery(cq);

			q.setParameter(param, author);

			List<Book> itemByYear = q.getResultList();

			if (itemByYear.size() != 0)
				for (Book i : itemByYear) {
					System.out.println(i);
				}

			else {
				System.out.println(author + " never wrote a book");
			}

		} finally {
			em.close();
			emf.close();
		}

	}

	// or part of it
	public static void findByTitle(String title) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CatalogoBiblioteca");
		EntityManager em = emf.createEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();

		CriteriaQuery<String> cq = cb.createQuery(String.class);

		Root<Book> b = cq.from(Book.class);

		Predicate pd1 = cb.like(b.get("title"), "%" + title + "%");

		cq.select(b.get("title")).where(pd1);

		Query q = em.createQuery(cq);

		List<String> itemList = q.getResultList();

		if (itemList.size() == 0) {
			System.out.println("No item found.");
		}
		for (String i : itemList) {
			System.out.println("Found: " + i);
		}

		em.close();
		emf.close();
	}

	// byCard
	public static void findUserActiveLoans(User user) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Homework_W3D3_");
		EntityManager em = emf.createEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Loan> cq = cb.createQuery(Loan.class);
		Root<Loan> p = cq.from(Loan.class);
		ParameterExpression<Integer> param = cb.parameter(Integer.class);

		Predicate pd1 = cb.equal(p.get("user_id"), param);
		Predicate pd2 = cb.equal(p.get("state"), true);

		cq.select(p).where(pd1).where(pd2);

		Query q = em.createQuery(cq);

		q.setParameter(param, user.getId());
		List<Loan> list = q.getResultList();

		for (Loan loan : list) {
			System.out.println(loan);
		}

		em.close();
		emf.close();

	}

	public static void elementOnLoanByCard(int userId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CatalogoBiblioteca");
		EntityManager em = emf.createEntityManager();

		User found = em.find(User.class, userId);

		if (found != null) {
			CriteriaBuilder cb = em.getCriteriaBuilder();

			CriteriaQuery<Item> cq = cb.createQuery(Item.class);

			Root<Loan> b = cq.from(Loan.class);

			// trova loan di userid inserito
			Predicate pd1 = cb.equal(b.get("user"), userId);

			// loan senza data di return
			Predicate pd2 = cb.isNull(b.get("actualReturnDate"));

			cq.select(b.get("id")).where(cb.and(pd1, pd2));

			Query q = em.createQuery(cq);

			List<Integer> itemList = q.getResultList();

			if (itemList.size() == 0) {
				System.out.println("User has no Item on loan.");
			}
			for (Integer i : itemList) {
				System.out.println("Found: " + LoanDAO.getById(i));
			}
		} else {
			System.out.println("User id is not valid.");
		}

		em.close();
		emf.close();
	}
	
	public static void elementOffLoanByCard(int userId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CatalogoBiblioteca");
		EntityManager em = emf.createEntityManager();


			CriteriaBuilder cb = em.getCriteriaBuilder();

			CriteriaQuery<Item> cq = cb.createQuery(Item.class);

			Root<Loan> b = cq.from(Loan.class);

			// loan senza data di return
			Predicate pd1 = cb.isNull(b.get("actualReturnDate"));

			cq.select(b.get("id")).where(pd1);

			Query q = em.createQuery(cq);

			List<Integer> itemList = q.getResultList();

			if (itemList.size() == 0) {
				System.out.println("there aren't no loans unreturned");
			}
			for (Integer i : itemList) {
				System.out.println("Found: " + LoanDAO.getById(i));
			}
	

		em.close();
		emf.close();
	}
	
	
}
