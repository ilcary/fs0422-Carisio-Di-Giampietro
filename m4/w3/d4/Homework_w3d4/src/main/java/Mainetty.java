
import DAO.ConcertoDAO;
import DAO.EventoDAO;
import DAO.GaraDiAtleticaDAO;
import DAO.LocationDAO;
import DAO.PartecipazioneDAO;
import DAO.PartitaDiCalcioDAO;
import DAO.PersonaDAO;
import models.GaraDiAtletica;
import models.Gender;
import models.GenereConcerto;
import models.PartitaDiCalcio;
import models.StatoPartecipazione;
import models.TipoEvento;

public class Mainetty {
	
//	Esercizio #1
//	Si faccia riferimento all'applicazione per la gestione degli eventi.
//
//	Usando le Named Queries JPA definite per mezzo delle annotazioni sulle entities, implementare i seguenti metodi:
//
//	EventoDAO:
//	- getPartiteVinteInCasa
//	- getPartiteVinteInTrasferta
//	- getPartitePareggiate
//	- getGareDiAtleticaPerVincitore(Persona vincitore)
//	- getGareDiAtleticaPerPartecipante(Persona partecipante)
//	- getEventiSoldOut [in cui il numero di partecipanti è = numeromassimopartecipanti]
//	- getEventiPerInvitato(Persona invitato) **** DIFFICILE ****
//
//	PartecipazioneDAO;
//	- getPartecipazioniDaConfermarePerEvento(Evento evento)

	public static void main(String[] args) {
		
//		PersonaDAO.save("Florinetty","Sutu","florinetty96@gmail.com", "29-07-1996", Gender.MALE);
//		LocationDAO.save("Piazza duomo", "Milano");
//		LocationDAO.save("Stadio dei pini","Avezzano");
//		LocationDAO.save("Matrimonio di Florin","Bucarest");
//		EventoDAO.save("23-10-2022", "Gara di accellerazione round 2", 150, TipoEvento.PUBBLICO, "DRAG WARS ITALY",LocationDAO.getById(1));
//		PartecipazioneDAO.save(PersonaDAO.getById(1), EventoDAO.getById(1), StatoPartecipazione.DA_CONFERMARE); 
//		
//		ConcertoDAO.save("23-10-2022", "Giovanni Giorgio", 150, TipoEvento.PUBBLICO, "Sotto il cielo stellato di Bangkok",LocationDAO.getById(4), GenereConcerto.ROCK, true);
//		ConcertoDAO.save("03-05-2023", "Club Dogo", 150, TipoEvento.PUBBLICO, "Sotto il cielo stellato di Milano",LocationDAO.getById(3), GenereConcerto.POP, false);
//		ConcertoDAO.save("23-10-2092", "Florin Salam", 150, TipoEvento.PUBBLICO, "Sotto il cielo stellato di Bucarest",LocationDAO.getById(5), GenereConcerto.CLASSICO, true);
//		
//		GaraDiAtleticaDAO.save("03-11-2022", "1000 siepi in the night", 150, TipoEvento.PUBBLICO, "Sotto il cielo stellato di Avezzano",LocationDAO.getById(4),PersonaDAO.getById(1).toString());
	
		//System.out.println(EventoDAO.getById(1).toString()); 
		
		//PartitaDiCalcioDAO.save("03-05-2023", "Partita di calcio fantastica", 150, TipoEvento.PUBBLICO, "Milan Juventus",LocationDAO.getById(3), "Milan","Juventus", "Milan", 3, 2);
		
		//PartitaDiCalcioDAO.save("03-05-2023", "Partita di calcio fantastica", 150, TipoEvento.PUBBLICO, "Roma Inter",LocationDAO.getById(2), "Roma","Inter", "Inter", 3, 4);
		
//		PartitaDiCalcioDAO.getPartiteVinteInCasa("Milan");
//		
//		PartitaDiCalcioDAO.getPartiteVinteInTrasferta("Inter");
		
		
//	PartitaDiCalcioDAO.save("03-05-2023", "Partita di calcio fantastica", 150, TipoEvento.PUBBLICO, "Fiorentina Argentina",LocationDAO.getById(2), "Fiorentina","Argentina", "pareggio" , 3, 3);
        
//		PartitaDiCalcioDAO.getPartitePareggiate("Argentina");
		
//		GaraDiAtleticaDAO.getGareDiAtleticaPerVincitore(PersonaDAO.getById(1));
        
		//GaraDiAtleticaDAO.save("03-11-2022", "1000 siepi in the night", 150, TipoEvento.PUBBLICO, "Sotto il cielo stellato di Avezzano",LocationDAO.getById(4),PersonaDAO.getById(1).toString());
		PersonaDAO.corri(PersonaDAO.getById(1),GaraDiAtleticaDAO.getById(13));
		
	}
	
}
