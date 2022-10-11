
import DAO.EventoDAO;
import DAO.LocationDAO;
import DAO.PartecipazioneDAO;
import DAO.PersonaDAO;
import models.Gender;
import models.StatoPartecipazione;
import models.TipoEvento;

public class Mainetty {

	public static void main(String[] args) {
		
		PersonaDAO.save("Florinetty","Sutu","florinetty96@gmail.com", "29-07-1996", Gender.MALE);
		//LocationDAO.save("Kartodromo La Maddalena", "Magliano");
		//LocationDAO.save("Aereoporto Civile L'Aquila","L'Aquila");
		//EventoDAO.save("23-10-2022", "Gara di accellerazione round 2", 150, TipoEvento.PUBBLICO, "DRAG WARS ITALY",LocationDAO.getById(1));
		 
		PartecipazioneDAO.save(PersonaDAO.getById(1), EventoDAO.getById(4), StatoPartecipazione.DA_CONFERMARE); 
		 
		//String name, String lastname, String email, String birthday, Gender gender
       
        // Location aereoporto = new Location("Aereoporto Civile L'Aquila","L'Aquila");
        
    
        
        //Evento eu1 = new Evento("2022-10-23","Campionato italiano accellerazione round 2", 180, TipoEvento.PUBLICO,"Race Wars Italy",aereoporto, sus );
        
       // String dataevento, String descrizione, int maxpartecipanti, TipoEvento tipoEvento,String titolo,Location location,Set<Partecipazione> partecipazioni_evento
        
        
        
 
		
	}
	
}
