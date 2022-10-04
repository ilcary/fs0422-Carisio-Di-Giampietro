package ES1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		HashSet<String> words = new HashSet<>();
		ArrayList<String> duplicate = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quante parole vuoi inserire?");
		
		boolean bool = true;
		int numP = 0;
		
		while(bool) {
			
			try {
				numP = Integer.parseInt(in.nextLine());			
			}catch(NumberFormatException nfe) {
				System.out.println(nfe);
				
			}finally {
				if(numP > 0) {
					bool = false;
				}
				System.out.println("Quante parole vuoi inserire?");
			}
		}
		
		for(int i = 1; i <= numP ; i++) {
			System.out.println("Inserisci la parola n."+i);
			String par = in.nextLine();
			
			if(words.contains(par)) {
				System.out.println("--- Duplicato trovato ---");
				duplicate.add(par);
			}
			
			words.add(par);
		}
		
		System.out.println("Parole distinte: " + words.size() + " :: " + words);
		System.out.println("Parole duplicate: " + duplicate.size() + " :: " + duplicate);

		in.close();		
	}

}
