package Dipendente;

public class ruolo {

	private role ruolo;
	private double moltiplicatoreStipendio;
	
	ruolo(role ruolo,double moltiplicatoreStipendio ){
		this.ruolo = ruolo;
		this.moltiplicatoreStipendio= moltiplicatoreStipendio;
	}
	
	public double getMoltiplicatoreStipendio() {
		return moltiplicatoreStipendio;
	}
	
	public role getRuolo() {
		return ruolo;
	}
	
}
