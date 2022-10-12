package models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="eventi")
public class Evento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	
	private String dataevento;
	private String descrizione;
	private int maxpartecipanti;
	
	@Column(name="tipoevento")
	@Enumerated(EnumType.STRING)
	private TipoEvento tipoEvento;
	
	private String titolo;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "location_id", referencedColumnName = "id")
	private Location location;
	
	@OneToMany(mappedBy="evento")
	private Set<Partecipazione> partecipazioni_evento= new HashSet<>();
	
	
	
	
	
	public Evento(){}

	public Evento( String dataevento, String descrizione, int maxpartecipanti, TipoEvento tipoEvento,
			String titolo,Location location) {
	
		this.dataevento = dataevento;
		this.descrizione = descrizione;
		this.maxpartecipanti = maxpartecipanti;
		this.tipoEvento = tipoEvento;
		this.titolo = titolo;
		
		
		this.location=location;
		
		this.partecipazioni_evento=partecipazioni_evento;
	}

	public Set<Partecipazione> getPartecipazioni_evento() {
		return partecipazioni_evento;
	}

	public void setPartecipazioni_evento(Set<Partecipazione> partecipazioni_evento) {
		this.partecipazioni_evento = partecipazioni_evento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataevento() {
		return dataevento;
	}

	public void setDataevento(String dataevento) {
		this.dataevento = dataevento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getMaxpartecipanti() {
		return maxpartecipanti;
	}

	public void setMaxpartecipanti(int maxpartecipanti) {
		this.maxpartecipanti = maxpartecipanti;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return titolo+" "+dataevento ;
	}
	

}