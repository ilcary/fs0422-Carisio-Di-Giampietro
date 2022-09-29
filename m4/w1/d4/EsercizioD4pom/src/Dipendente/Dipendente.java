package Dipendente;

//
//Esercizio #1
//Scrivere la classe Dipendente che ha i seguenti attributi:
//
//Attributi statici
//- stipendioBase - numero decimale con stipendio base mensile prevalorizzato a 1000 accessibile a tutte le classi
//
//- matricola - identificativo univoco del dipendente
//- stipendio - numero decimale con stipendio base mensile calcolato per il dipendente
//- importoOrarioStraordinario - numero decimale con importo per ogni ora di straordinario
//- Livello - valori possibili [OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE]
//- Dipartimento - Valori possibili [PRODUZIONE, AMMINISTRAZIONE, VENDITE]
//
//Le proprietÃ  devono essere accessibili solo dalla classe Dipendente e deve essere possibile leggerle tramite opportuni metodi get ma non modificarle, tranne le proprietÃ  Dipartimento e importoOrarioStraordinario  che possono essere modificate da altre classi tramite un metodo di set.
//
//Definire due costruttori: 
//- uno che accetti solo la matricola e Dipartimento ed imposti i seguenti valori
//	- stipendio = stipendioBase
//	- importoOrarioStraordinario = 30
//	- Livello = OPERAIO
//- Uno che accetti tutti i parametri
//
//Definire i seguenti metodi
//- stampaDatiDipendente - Stampa i dati del dipendente
//- promuovi - aggiorna il livello del dipendente con la seguente logica 
//	se il Dipendente Ã¨ operaio lo promuove a impiegato
//	se il Dipendente Ã¨ impiegato lo promuove a quadro
//	se il Dipendente Ã¨ quadro lo promuove a dirigente
//	se il Dipendente Ã¨ dirigente resta tale e scrive un messaggio di errore
//  Il metodo aggiorna inoltre lo stipendio del dipendente con la seguente logica
//	- IMPIEGATO = stipendioBase * 1,2
//	- QUADRO = stipendioBase * 1,5
//	- DIRIGENTE = stipendioBase * 2
// Infine il metodo ritorna il nuovo livello del dipendente
//
//Definire i seguenti metodi statici:
//- calcolaPaga - accetta un'istanza di dipendente e ne ritorna lo stipendio mensile
//- calcolaPaga - accetta un'istanza di dipendente ed un parametro intero con le ore di straordinario e ritorna lo stipendio mensile comprensivo di straordinario
//



public class Dipendente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	
	
	//priprietà statica stipendio base
	private static int stipendioBase = 1000;
	
	//proprietà relative all'istanza
	private int matricola;
	private double importoStraordinario;
	private ruolo livello;
	private int stipendioTotale;
	private dipartimento sezione;
	
	
	//primo constructor
	public Dipendente(int matricola, dipartimento sezione){
		this.matricola=matricola;
		this.sezione= sezione;
		//impostiamo
		this.livello = RuoliDellAzienda.operaio;
		this.importoStraordinario=30;
		
	}
	
	
	//secondo constructor
	public Dipendente(int matricola, dipartimento sezione, ruolo livello){
		this.matricola=matricola;
		this.sezione= sezione;
		this.livello = livello;
		this.importoStraordinario = 30;
	}
	
	
	//metodi GET
	
	public void getMatricola() {
		System.out.println(matricola);
	}
	
	public void getImportoStraordinario() {
		System.out.println(importoStraordinario);
	}
	
	public void getLivello() {
		System.out.println(livello);
	}
	
	public void getDipartimento() {
		System.out.println(sezione);
	}
	
	public int getStipTotale() {
		int s = (int) (stipendioBase * this.livello.getMoltiplicatoreStipendio());
		System.out.println(s);
		return s;
	}
	
	public void getStiTotaleStraordinari(int h) {
		int StiTotaleStraordinari = (int) (stipendioTotale + (importoStraordinario * h));
		System.out.println(StiTotaleStraordinari);
	}
	
	
	
	
	//metodi SET
	
	public void setDipartimento(dipartimento d) {
		this.sezione = d;
	}
	
	public void setImportoStraordinario(double s) {
		this.importoStraordinario = s;
	}
	
	
	//metodi gestionali
	
	public void stampaDipendente() {
		System.out.printf("Il dipendente con la matricola: %s che lavora come %s nel dipartimento %s e il suo stipendio è %n",
				matricola,
				livello.getRuolo(),
				sezione,
				getStipTotale()
				);
	}
	
	public role promuoviDipendente() {
		switch (livello.getRuolo()){
		case OPERAIO:
			livello = RuoliDellAzienda.impiegato ;
			break;
		case IMPIEGATO:
			livello = RuoliDellAzienda.quadro ;
			break;
		case QUADRO:
			livello = RuoliDellAzienda.dirigente ;
			break;
		case DIRIGENTE:
			System.out.println("Non lo so già sei Dirigente che voui di più?");
			break;
		}
		
		System.out.println(livello.getRuolo());
			return livello.getRuolo();
	}
	
	
	
	

}








































