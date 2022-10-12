
import DAO.ConcertoDAO;
import DAO.EventoDAO;
import DAO.GaraDiAtleticaDAO;
import DAO.LocationDAO;
import DAO.PartecipazioneDAO;
import DAO.PersonaDAO;
import models.GaraDiAtletica;
import models.Gender;
import models.GenereConcerto;
import models.StatoPartecipazione;
import models.TipoEvento;

public class Mainetty {

	public static void main(String[] args) {
		
		//PersonaDAO.save("Florinetty","Sutu","florinetty96@gmail.com", "29-07-1996", Gender.MALE);
		//LocationDAO.save("Piazza duomo", "Milano");
		//LocationDAO.save("Stadio dei pini","Avezzano");
		//LocationDAO.save("Matrimonio di Florin","Bucarest");
		//EventoDAO.save("23-10-2022", "Gara di accellerazione round 2", 150, TipoEvento.PUBBLICO, "DRAG WARS ITALY",LocationDAO.getById(1));
		//PartecipazioneDAO.save(PersonaDAO.getById(1), EventoDAO.getById(1), StatoPartecipazione.DA_CONFERMARE); 
		
		//ConcertoDAO.save("23-10-2022", "Giovanni Giorgio", 150, TipoEvento.PUBBLICO, "Sotto il cielo stellato di Bangkok",LocationDAO.getById(4), GenereConcerto.ROCK, true);
		//ConcertoDAO.save("03-05-2023", "Club Dogo", 150, TipoEvento.PUBBLICO, "Sotto il cielo stellato di Milano",LocationDAO.getById(3), GenereConcerto.POP, false);
		//ConcertoDAO.save("23-10-2092", "Florin Salam", 150, TipoEvento.PUBBLICO, "Sotto il cielo stellato di Bucarest",LocationDAO.getById(5), GenereConcerto.CLASSICO, true);
		
		GaraDiAtleticaDAO.save("03-11-2022", "1000 siepi in the night", 150, TipoEvento.PUBBLICO, "Sotto il cielo stellato di Avezzano",LocationDAO.getById(4),PersonaDAO.getById(1).toString());
		
		//System.out.println(EventoDAO.getById(1).toString()); 
		
        
        
 
		
	}
	
}
