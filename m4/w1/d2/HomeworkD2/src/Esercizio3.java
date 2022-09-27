
public class Esercizio3 {

	public static void main(String[] args) {
		
	}
	
	class Articolo{
		int codiceArticolo;
		String descrizioneArticolo;
		int prezzo;
		int numeroPezzi;
		Articolo(int codiceArticolo,String descrizioneArticolo,int prezzo,int numeroPezzi){
			this.codiceArticolo=codiceArticolo;
			this.descrizioneArticolo= descrizioneArticolo;
			this.prezzo=prezzo;
			this.numeroPezzi=numeroPezzi;
		}
		
	}
	
	class Cliente{
		int codiceCliente;
		String nome;
		String cognome;
		String email;
		String dataIscrizione;
		Cliente(int codiceCliente, String nome, String cognome, String email, String dataIscrizione){
			this.codiceCliente=codiceCliente;
			this.nome= nome;
			this.cognome= cognome;
			this.email=email;
			this.dataIscrizione=dataIscrizione;
		}
		
	}
	
	
	class Carello{
		Cliente client ;
		String[] elencoCarello;
		int prezzo;
		Carello(Cliente client ,String[] elencoCarello,int prezzo){
			this.client=client ;
			this.elencoCarello=elencoCarello;
			this.prezzo=prezzo;
		}
		
	}
	
}
