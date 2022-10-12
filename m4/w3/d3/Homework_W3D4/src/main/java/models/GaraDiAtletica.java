package models;

import javax.persistence.Entity;

@Entity
public class GaraDiAtletica extends Evento {

	private String set_atleti;
	private String atleta_vincitore;
	
	public GaraDiAtletica() {}

	public GaraDiAtletica(String dataevento, String descrizione, int maxpartecipanti, TipoEvento tipoEvento,
			String titolo, Location location, String atleta_vincitore) {
		super(dataevento, descrizione, maxpartecipanti, tipoEvento, titolo, location);
		this.atleta_vincitore = atleta_vincitore;
		
	}
	


	public String getSet_atleti() {
		return set_atleti;
	}

	public void setSet_atleti(String set_atleti) {
		this.set_atleti = set_atleti;
	}

	public String getAtleta_vincitore() {
		return atleta_vincitore;
	}

	public void setAtleta_vincitore(String atleta_vincitore) {
		this.atleta_vincitore = atleta_vincitore;
	}

	 
	
	
	
}
