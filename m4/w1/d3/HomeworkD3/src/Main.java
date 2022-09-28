import Hw1.Hw1;
import Hw2.Hw2;
import Hw3.Hw3;
import Hw4.Hw4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//es1///////////////////////////////////////////
		
		System.out.println(Hw1.strPariDispari("popi"));
		System.out.println(Hw1.annoBisestile(2021));
		
		
		//es2/////////////////////////////////////
		Scanner popipopi = new Scanner(System.in);
		
		System.out.println("-ES2- Inserisci un numero");
		int s = Integer.parseInt(popipopi.nextLine());
		
		Hw2.checkNum(s);
		
		
		
		
		//es3/////////////////////////////////
		System.out.println("-ES3- Inserisci una parola");
		String sus = popipopi.nextLine();
		
		while(!sus.equals("q")) {
			Hw3.stringify(sus);
			System.out.println("Inserisci una parola oppure il carattere q per andare avanti");
			sus = popipopi.nextLine();
		}
			 
			
			
		//es4////////////////////////////////////	 
		System.out.println("-ES4- Inserisci un numero");
		
		int num = Integer.parseInt(popipopi.nextLine());
		
		Hw4.contoAllaRovescia(num);
		
		popipopi.close();
		
		
	}

}
