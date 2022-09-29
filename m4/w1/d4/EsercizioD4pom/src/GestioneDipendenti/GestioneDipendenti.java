package GestioneDipendenti;

import Dipendente.Dipendente;
import Dipendente.RuoliDellAzienda;
import Dipendente.dipartimento;

public class GestioneDipendenti {

	public static void main(String[] args) {

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
		
		
	}

}
