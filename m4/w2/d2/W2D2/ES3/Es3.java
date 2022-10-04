package ES3;

import java.util.HashMap;
import java.util.Map.Entry;

public class Es3 {
	public static void main(String[] args) {
		
		HashMap<String, String> rubrica = new HashMap<>();
		
		aggiungi(rubrica, "Carisio", "340 420 6969");
		aggiungi(rubrica, "Florin", "340 690 6666");
		aggiungi(rubrica, "Claudio", "340 666 4201");
		
		System.out.println("Tutti i contatti: " + rubrica);
		elimina(rubrica, "Florin");
		System.out.println("Tutti i contatti: " + rubrica);
		System.out.println("Cerca per numero: " + trovaConNum(rubrica, "340 666 4201"));
		System.out.println("Cerca per nome: " + trovaConNome(rubrica, "Carisio"));
	}
	
	public static void aggiungi(HashMap<String, String> map, String n, String num) {
		map.put(n, num);
	}
	
	public static void elimina(HashMap<String, String> map, String n) {
		map.remove(n);
	}
	
	public static String trovaConNum(HashMap<String, String> map, String n) {

		String res = "";
		for (Entry<String, String> entry : map.entrySet()) {
			if (entry.getValue().equalsIgnoreCase(n)) {
				res = entry.getKey();
			}
		}
		return (res == "") ? "Non trovato" : res;
	}
	
	public static String trovaConNome(HashMap<String, String> map, String n) {
		return (map.get(n) == null) ? "Non trovato" : map.get(n);
	}
	
}
