
public class Giorno1 {

	public static void main(String[] args) {
		
		// tipoDato nomeVariabile
		int x = 100;
		byte v1 = 100;
		short v2 = 32_000;
		int v4 = 100;
		long v3 = 100000000000L;
		
		System.out.println( x );
		System.out.println( v1 + v2 );
		
		System.out.println( "ciao" + " a tutti" );
		System.out.println( "il valore di v1 è: " + v1 );
		
		System.out.println( "il valore di v1 è: " + ((v1 + v1) / 10) );
		
		System.out.println( 100 + 100 + "ciao" );
		
		boolean b1 = true;
		boolean b2 = false;
		
		float v5 = 100.45f;
		double v6 = 167.56789765;
		double v7 = 1800;
		
		System.out.println( v7 );
		
		//int y = "ciao";
		
		char c1 = 'c';
		char c2 = 'i';
		System.out.println( c1 + c2 );
		
		char c3 = 97;
		System.out.println( c3 );
		
		String studentName = "luigi";
		byte studentAge = 28;
		
		System.out.println( 
			"Nome Studente: " + studentName + " | Età Studente: " + studentAge 
		);
		
		System.out.print( "ciao sono " );
		System.out.print( "un messaggio" + System.lineSeparator() );
		
		System.out.printf( 
			"Nome Studente: %s | Età Studente: %d %n",
			studentName, studentAge
		);
		
		char ch1 = 'c';
		char ch2 = 'i';
		char ch3 = 'a';
		char ch4 = 'o';
		
		System.out.print( ch1 );
		System.out.print( ch2 );
		System.out.print( ch3 );
		System.out.print( ch4 + System.lineSeparator() );
		
		System.out.println( ch1 + "" + ch2 + "" + ch3 + "" + ch4 );
		
		int a = 10, b = 10;
		
		// costante
		final String teacher = "Riccardo Degni";
		// teacher = "Mario Rossi";
		
		System.out.println( teacher.length() );
		System.out.println( teacher.charAt( 0 ) );
		System.out.println( teacher.toUpperCase() );
		
		// 0,0,0,0
		int[] numeri = new int[4];
		numeri[0] = 17;
		numeri[1] = 5;
		numeri[2] = 87;
		
		// 17,5,87,0
		System.out.println( numeri[1] );
		
		String[] studenti = {
			"mario", "luigi", "daisy", "peach", "yoshi"
		};
		
		System.out.println( studenti[2] );
		System.out.println( studenti.length );
		
		int i = 0;
		while( i < studenti.length ) {
			System.out.println( studenti[i] );
			i++;
		}
		
		i = 0;
		do {
			System.out.println( studenti[i] );
			i++;
		} while( false );
		
		System.out.println( "------------------------------" );
		for(int j = 0, k = studenti.length - 1; j < studenti.length; j++, k--) {
			System.out.println( studenti[j] );
			System.out.println( "posizione invertita: " + k );
		}
		
		String[][] studenti2 = {
			{ "anna", "ugo", "bianca" },		// 0
			{ "luca", "william" }				// 1
		};
		
		System.out.println( studenti2[1][1] );
		
		System.out.println( "------------------------------" );
		for( int j = 0; j < studenti2.length; j++ ) {
			System.out.println( "Riga " + j );
			
			for( int k = 0; k < studenti2[j].length; k++ ) {
				System.out.print( studenti2[j][k] + " " );
			}
			System.out.println();
		}
		
		double d1 = 10.56764;
		// ...
		int z = (int)d1;
		System.out.println( z );
		
		int w = 678;
		byte by2 = (byte)w;
		System.out.println( by2 );
		
	}

}
