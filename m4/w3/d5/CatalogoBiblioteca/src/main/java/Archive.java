import java.time.LocalDate;

import DAO.ArchiveDAO;
import DAO.BookDAO;
import DAO.LoanDAO;
import DAO.MagazineDAO;
import DAO.UserDAO;

import models.Every;


public class Archive {

	public static void main(String[] args) {
		
//		UserDAO.save("Carisio", "Di Giampietro",LocalDate.of(2001,9,30));//yyyy,mm,dd
//		UserDAO.save("Davide", "Dal Santo",LocalDate.of(1998,9,5));
//		
//		BookDAO.save("Don Quixote","1605", 1000,"Miguel de Cervantes", "Adventure");
//		BookDAO.save("Jonathan Strange & il signor Norrell","2005", 2000,"Susanna Clarke", "Fantasy");
		BookDAO.save("Frankenstein","1818", 2000,"Mary Shelley", "Horror");
//		
//		MagazineDAO.save("Quattroruote", "2020", 50, Every.MONTH);
//		MagazineDAO.save("Medioevo Dossier", "2020", 80, Every.SIXMONTH);
		
		//LoanDAO.save(UserDAO.getById(1), BookDAO.getById(1));
		//LoanDAO.save(UserDAO.getById(2), BookDAO.getById(2));
		
		
		
		LoanDAO.endLoan(LoanDAO.getById(2));
		ArchiveDAO.findByAuthor("Miguel de Cervantes");
		ArchiveDAO.elementOffLoanByCard(1);
		//LoanDAO.save(UserDAO.getById(1), BookDAO.getById(5));
	}

}
//addLibro( new Libro("Don Quixote", "2019", 200, "Miguel de Cervantes", Type.ADVENTURE));
//addLibro( new Libro("Jonathan Strange & il signor Norrell", "2005", 200, "Susanna Clarke", Type.FANTASY));
//addRivista( new Rivista("Medioevo Dossier", "2020", 50, Periodicita.SEMESTRALE));
//addRivista( new Rivista("Quattroruote", "2020", 20, Periodicita.MENSILE));
//addLibro(new Libro("Shining", "1977", 800, "Stephen King", Type.HORROR));
//addLibro(new Libro("Frankenstein", "1818", 800, "Mary Shelley", Type.HORROR));
//addLibro(new Libro("L'incubo di Hill House", "1959", 500, "Shirley Jackson", Type.HORROR));
//addLibro(new Libro("Odio Volare", "2018", 500, "Stephen King", Type.HORROR));