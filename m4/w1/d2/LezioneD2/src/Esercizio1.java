
public class Esercizio1 {
	
//	Creare una classe Studente con i seguenti campi:
//		idMatricola, nome, cognome, voti
//
//		dove voti è un array di 5 byte.
//		La classe avrà il metodo:
//		stampaMedia() che stampa la media voti dello studente
//
//		ed un'implementazione del metodo equals che consente di comparare due studenti con la seguente logica:
//		se due studenti hanno la stessa media voti e lo stesso nome/cognome, sono uguali, altrimenti no
//
//		Creare 3 istanze di Studente assegnando attraverso un apposito costruttore i suoi valori (a piacere) e stabilire chi
	//è lo studente migliore (media voti più alta) e se esistono studenti uguali nella classe.

	public static void main(String[] args) {
		
	Studente s1 = new Studente("Mario", "Rossi", new byte[]{5,6,8,5,10} );
	Studente s2 = new Studente("Mario", "Rossi", new byte[]{5,6,8,5,10} );
	Studente s3 = new Studente("Luigi", "Verdi", new byte[]{10,6,5,9,6} );
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.matricola+ " " +s2.matricola+ " " +s3.matricola );
	
	
	System.out.println(migliorStudente(new Studente[] {s1,s2,s3}));
	}
	
	
	public static String migliorStudente(Studente[] studenti) {
		
		String nomeMi = "" ;
		double mediaMi = 0;
		
		for(Studente s : studenti) {
			
		if(s.media > mediaMi)
			mediaMi= s.media;
			nomeMi= s.nome + " " + s.cognome;
		}
		
		 return "Il mioglior studente è " + nomeMi + " " + "con la media del " + mediaMi; 
	}
	
	
}
class Studente{
		int matricola;
		String nome;
		String cognome;
		byte[] voti;
		double media;
		static int id = 0;
		
		Studente(String _nome, String _cognome , byte[] _voti){
			nome= _nome;
			cognome =_cognome;
			voti=new byte[5];
			if(_voti.length==5) {
				for(int i=0 ; i<_voti.length ; i++) {
					voti[i]= _voti[i];
				}	
			}
			matricola = this.id++;
			this.stampaMedia();
		
		}
		
		
		@Override
		public boolean equals(Object obj) {
			Studente other = (Studente) obj;
			return this.nome.equals(other.nome) &&
					this.cognome.equals(other.cognome) &&
					this.media == other.media ;
		}
		
		
	private void stampaMedia(){
			int sum = 0;
			
			for(int value : this.voti  ) {
				sum += value;
			}
			
			double media = sum/this.voti.length;
			System.out.println(media  );
			
			this.media= media;
			
			
		}
	}