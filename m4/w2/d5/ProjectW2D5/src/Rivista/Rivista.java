package Rivista;

import AbstractBook.Browsable;
import GestioneLibri.Periodicita;

public class Rivista extends Browsable{
	
		private Periodicita Periodicita;
	
	public Rivista(String titolo, String yearPublished, int pages, Periodicita Periodicita){
		super(titolo,yearPublished,pages);
		this.Periodicita=Periodicita;
	}
	
	public Periodicita getPeriodicita() {
		return this.Periodicita;
	}
	
	public static void main(String[] args) {}
	
	@Override
	public String toString() {
		return "|| Rivista: " + getTitolo()+" di periodicita"+Periodicita + " ISBN: " + getISBN();
	}

}
