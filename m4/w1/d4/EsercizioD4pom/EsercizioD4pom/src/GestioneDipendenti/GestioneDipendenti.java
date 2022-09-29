package GestioneDipendenti;

import Dipendente.Dipendente;
import Dipendente.RuoliDellAzienda;
import Dipendente.dipartimento;

public class GestioneDipendenti {
	
	

	public static void main(String[] args) {
		
		int totaleStipendi = 0;

		Dipendente FrancyFrancy = new Dipendente(67051, dipartimento.PRODUZIONE);
		Dipendente Florin = new Dipendente(67052, dipartimento.PRODUZIONE);
		//int matricola, dipartimento sezione, ruolo livello
		Dipendente Beatrice = new Dipendente(61053, dipartimento.PRODUZIONE, RuoliDellAzienda.impiegato );
		Dipendente SirDDS = new Dipendente(61054, dipartimento.VENDITE, RuoliDellAzienda.dirigente );
		
		//promuovere da operaio a impiegato
		Florin.stampaDipendente();
		Florin.promuoviDipendente();
		Florin.stampaDipendente();
	
		//promuovere da impiegato a quadro de picasso
		Beatrice.stampaDipendente();
		Beatrice.promuoviDipendente();
		Beatrice.stampaDipendente();

		//stampo i dati dei dipendenti restanti
		FrancyFrancy.stampaDipendente();
		SirDDS.stampaDipendente();
		SirDDS.promuoviDipendente();
		
		totaleStipendi += FrancyFrancy.getStiTotaleStraordinari(5);
		totaleStipendi += Florin.getStiTotaleStraordinari(5);
		totaleStipendi += Beatrice.getStiTotaleStraordinari(5);
		totaleStipendi += SirDDS.getStiTotaleStraordinari(5);
		
		
		System.out.println("Il totale degli stipendi con 5 ore di straordinari per tutti è " + totaleStipendi);
	}

}
