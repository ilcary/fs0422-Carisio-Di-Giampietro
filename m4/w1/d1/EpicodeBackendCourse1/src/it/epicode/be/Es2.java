package it.epicode.be;

import java.util.Scanner;

public class Es2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("come ti chiami?");
		String name= in.nextLine();
		
		System.out.println("Dove sei nato?");
		String city= in.nextLine();
		
		System.out.println("Qual'è il tuo piatto preferito?");
		String food= in.nextLine();
		
		System.out.printf("Ti chiami: %s | Sei nato a : %s | Il tuo piatto preferito è: %s %n", name, city, food );
		System.out.printf( "Il tuo piatto preferito è: %s |Sei nato a : %s |Ti chiami: %s %n" ,food, city , name );
		in.close();
	}

}
