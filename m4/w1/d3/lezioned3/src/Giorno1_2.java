import java.util.Scanner;

public class Giorno1_2 {

	public static void main(String[] args) {
		
		System.out.println( 9 % 3 );
		
		int x = 10;
		
		if( x > 10 || x < 100 ) {
			System.out.println("blue");
		}
		else {
			System.out.println( "red" );
		}
		
		boolean b1 = true, b2 = false;
		
		if( !b1 || (!b2 && b1) ) {
			System.out.println( "green" );
		}
		else {
			System.out.println( "pink" );
		}
		
		for(int i = 10; i >= 0; i = i - 2) {
			if( i % 2 == 0 ) {
				System.out.println( i );
			}
		}
		
		// chiamata
		saluta( "luigi", "green" );
		saluta( "mario", "red" );
		saluta( "daisy" + 100, "pink" );
		
		System.out.println(
			somma(10, 4)
		);
		
		int res1 = somma(34, 4);
		System.out.println( res1 );
		
		System.out.println(
				somma( differenza(10, 5), somma(differenza(45, 2), 10) )
		);
		
		System.out.println( dammiNomePiu("evidenziatore", "mela", true) );
		System.out.println( dammiNomePiu("evidenziatore", "mela", false) );
		
		Scanner in = new Scanner(System.in);
		
		System.out.println( "dammi nome:" );
		String n = in.nextLine();
		
		System.out.println( "dammi età:" );
		int a = Integer.parseInt( in.nextLine() );
		
		System.out.println( "il tuo nome è " + n + " e la tua età è: " + a );
		
		in.close();
		
	}

	public static void saluta( String name, String lastname ) {
		System.out.printf( "ciao, da %s %s! %n", name, lastname );
		System.out.println( "ciao, da " + name + " " + lastname );
	}
	
	public static int somma(int x, int y) {
		return x + y;
	}
	
	public static int differenza(int x, int y) {
		return x - y;
	}
	
	public static String dammiNomePiu( String n1, String n2, boolean mode ) {
		
		int l1 = n1.length();
		int l2 = n2.length();
		
		/*
		if( mode ) {
			return ( l1 > l2 ) ? n1 : n2;
		}
		else {
			return ( l1 < l2 ) ? n1 : n2;
		}
		*/
		
		// DRY dont repeat yourself
		return ( mode ) ?
			( l1 > l2 ) ? n1 : n2
			: ( l1 < l2 ) ? n1 : n2;
		
	}
	
}
