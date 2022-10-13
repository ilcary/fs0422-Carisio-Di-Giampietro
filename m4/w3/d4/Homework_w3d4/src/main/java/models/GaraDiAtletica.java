package models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class GaraDiAtletica extends Evento {

	@ManyToMany(mappedBy="atlets")
	private Set<Person> set_atleti = new HashSet<>();
	
	private String atleta_vincitore;
	
	public GaraDiAtletica() {}

	public GaraDiAtletica(String dataevento, String descrizione, int maxpartecipanti, TipoEvento tipoEvento,
			String titolo, Location location, String atleta_vincitore) {
		super(dataevento, descrizione, maxpartecipanti, tipoEvento, titolo, location);
		this.atleta_vincitore = atleta_vincitore;
		
	}
	

	public String getAtleta_vincitore() {
		return atleta_vincitore;
	}

	public Set<Person> getSet_atleti() {
		return set_atleti;
	}

	public void setSet_atleti(Person atleta) {
		this.set_atleti.add(atleta);
	}

	public void setAtleta_vincitore(String atleta_vincitore) {
		this.atleta_vincitore = atleta_vincitore;
	}

	 
	
	
	
}
