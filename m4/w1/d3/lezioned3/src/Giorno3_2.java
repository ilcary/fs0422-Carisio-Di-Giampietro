
public class Giorno3_2 {

	public static void main(String[] args) {
		
		System.out.println("---------------------");
		for(int i = 1; i <= 10; i++) {
			
			for(int j = 10; j >= 1; j--) {
				if( i == 4 ) continue;
				System.out.print( j + " / " );
			}
			
			if( i == 2 ) break;
			System.out.println( i );
		}
		
		int x = m1();
		System.out.println(x);
		
		boolean r1 = m2();
		System.out.println( r1 );
		
		double x2 = 10.0 / 3;
		
		boolean r2 = m3();
		System.out.println( r2 );
		
		boolean r3 = m4();
		System.out.println( r3 );
		
	}
	
	static int m1() {
		System.out.println("---------------------");
		for(int i = 1; i <= 2; i++) {
			if( i == 4 ) {
				return 10;
			}
			System.out.println( i );
		}
		
		return 20;
		
		//System.out.println("ciao");
	}
	
	static boolean m2() {
		
		boolean res = true;
		String type = "front-end";
		String lang = "javascript";
		double version = 1.8;
		
		for(int k = 3; k > 1; k--) {			
			if( type.equals("front-end") && lang == "javascript" && k % 2 == 0 ) {
				res = !res;
			}
		}
		
		return (version == 1.0 + 0.8) ? !res : res;
	}
	
	/*
	 * adiener -> false
	 * 
	 */
	static boolean m3() {
		
		int x = 10;
		double y = 10.0d;
		char ch1 = 'a';
		boolean res = true;
		
		int i = 0;
		while(true) {
			
			if( x == y && i == 3 ) {
				res = !res;
				break;
			}
			
			i++;
			
		}
		
		switch(ch1) {
			case 96:
				res = !res;
				break;
			default:
				res = !res;
			case 94:
				res = false;
				break;
			case 95:
				res = true;
				break;
		}
		
		return res;
		
	}
	
	static boolean m4() {
		boolean res = false;
		
		String a = "java";
		String b = "java";
		String c = new String("java");
		String d = new String("java");
		
		if( a == b && !a.equals(b) ) {
			res = !res;
		} 
		else if( a == c && !a.equals(c) ) {
			res = !res;
		}
		else if( c == d || d.equals(c) ) {
			System.out.println( "here " + res );
			res = (a == "ja" + "va" ) ? !res : res;
		}
		
		return !res;
	}

}

/*
 * k		3		2		1
 * res    	true  	false
 */
