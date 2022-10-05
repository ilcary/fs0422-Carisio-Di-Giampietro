package homework_3;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;


public class Homework_3 {
	
	static HashMap<String, Integer > listaPresenze = new HashMap<>();
	static File presenzeFile = new File("docs/presenze.txt");

	public static void main(String[] args) {
		
		
		listaPresenze.put("Luigi", 12);
		listaPresenze.put("Giovanni", 6);
		listaPresenze.put("Mario", 2);
		listaPresenze.put("Florin", 2);
		listaPresenze.put("SirDDS", 5);
		listaPresenze.put("FrancyFrancy", 15);
		listaPresenze.put("BeaCaccaPupu", 85);
		
		System.out.println(listaPresenze.toString());
		
		salvaPresenze();
		leggiPresenze();
		
	}
	
	public static void salvaPresenze() {
		
		String presenze = listaPresenze.toString().replace('=','@').replace(',','#');
		
		System.out.println(presenze);
		
		try {
			FileUtils.writeStringToFile(presenzeFile, presenze, "UTF-8");
		} catch (IOException e) {
		System.out.println("hey boss something went wrong :(");
		}
		
		
	}
	
	public static void leggiPresenze() {
		
		String readFileToString="";
		try {
			 readFileToString = FileUtils.readFileToString(presenzeFile,"UTF-8");
		} catch (IOException e) {
			System.out.println("hey boss something went wrong :(");
		}
		
		System.out.println("file letto "+readFileToString);
		
	}
	
}


