package models;

import javax.persistence.Entity;

@Entity
public class PartitaDiCalcio extends Evento{

	private String squadra_casa;
	private String squadra_ospite;
	private String squadra_vincente;
	private int gol_casa;
	private int gol_ospite;
	
	
	public PartitaDiCalcio() {
	}


	public PartitaDiCalcio(String dataevento, String descrizione, int maxpartecipanti, TipoEvento tipoEvento,
			String titolo, Location location, String squadra_casa, String squadra_ospite, String squadra_vincente,
			int gol_casa, int gol_ospite) {
		
			super(dataevento, descrizione, maxpartecipanti, tipoEvento, titolo, location);
			this.squadra_casa = squadra_casa;
			this.squadra_ospite = squadra_ospite;
			this.squadra_vincente = squadra_vincente;
			this.gol_casa = gol_casa;
			this.gol_ospite = gol_ospite;
	}


	public String getSquadra_casa() {
		return squadra_casa;
	}


	public void setSquadra_casa(String squadra_casa) {
		this.squadra_casa = squadra_casa;
	}


	public String getSquadra_ospite() {
		return squadra_ospite;
	}


	public void setSquadra_ospite(String squadra_ospite) {
		this.squadra_ospite = squadra_ospite;
	}


	public String getSquadra_vincente() {
		return squadra_vincente;
	}


	public void setSquadra_vincente(String squadra_vincente) {
		this.squadra_vincente = squadra_vincente;
	}


	public int getGol_casa() {
		return gol_casa;
	}


	public void setGol_casa(int gol_casa) {
		this.gol_casa = gol_casa;
	}


	public int getGol_ospite() {
		return gol_ospite;
	}


	public void setGol_ospite(int gol_ospite) {
		this.gol_ospite = gol_ospite;
	}


	

	
}
