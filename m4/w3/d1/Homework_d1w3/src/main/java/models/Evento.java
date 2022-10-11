package models;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eventi")
public class Evento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String titolo;

	private String descrizione;
	
	private int maxPartecipanti;
	
	@Enumerated
	private tipoEvento tipoEvento;
	
	private String dataEvento;
	
	public Evento(){}

	public Evento(String titolo, String descrizione, int maxPartecipanti,tipoEvento tipoEvento, String dataEvento) {
		super();
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.maxPartecipanti = maxPartecipanti;
		this.tipoEvento = tipoEvento;
		this.dataEvento = dataEvento;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getMaxPartecipanti() {
		return maxPartecipanti;
	}

	public void setMaxPartecipanti(int maxPartecipanti) {
		this.maxPartecipanti = maxPartecipanti;
	}

	public String getTipoEvento() {
		return tipoEvento.toString();
	}

	public void setTipoEvento(tipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	
	@Override
	public String toString() {
		return this.titolo+" del tipo "+this.getTipoEvento();
	}

}
