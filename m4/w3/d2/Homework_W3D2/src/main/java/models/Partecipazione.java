package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="partecipazioni")
public class Partecipazione {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "partecipazioni_person", referencedColumnName = "id")
	private Person person;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="partecipazioni_event", referencedColumnName = "id")
	private Evento evento;
	
	@Enumerated(EnumType.STRING)
	private StatoPartecipazione stato_partecipazione;
	
	public Partecipazione(){}

	public Partecipazione(Person person, Evento evento, StatoPartecipazione stato_partecipazione) {
		this.person = person;
		this.evento = evento;
		this.stato_partecipazione = stato_partecipazione;
	}

	public int getId() {
		return id;
	}


	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public StatoPartecipazione getStato_partecipazione() {
		return stato_partecipazione;
	}

	public void setStato_partecipazione(StatoPartecipazione stato_partecipazione) {
		this.stato_partecipazione = stato_partecipazione;
	}
	
	

}
