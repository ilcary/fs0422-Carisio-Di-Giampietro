package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Concerto extends Evento{
	
	@Enumerated(EnumType.STRING)
	private GenereConcerto  genere_concerto;
	private boolean in_streaming;
	
	
	public Concerto() {
	}


	public Concerto(String dataevento, String descrizione, int maxpartecipanti, TipoEvento tipoEvento, String titolo,
			Location location,GenereConcerto genere_concerto, boolean in_streaming) {
		super(dataevento, descrizione, maxpartecipanti, tipoEvento, titolo, location);
		this.genere_concerto = genere_concerto;
		this.in_streaming = in_streaming;
	}


	public GenereConcerto getGenere_concerto() {
		return genere_concerto;
	}


	public void setGenere_concerto(GenereConcerto genere_concerto) {
		this.genere_concerto = genere_concerto;
	}


	public boolean isIn_streaming() {
		return in_streaming;
	}


	public void setIn_streaming(boolean in_streaming) {
		this.in_streaming = in_streaming;
	}



					
					
	
}
