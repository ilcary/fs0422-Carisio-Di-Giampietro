import java.util.Arrays;

public class Giorno2 {

	public static void main(String[] args) {
		
		// creazione istanza
		// s1
		Student s1 = new Student();
		s1.name = "mario";
		s1.lastname = "rossi";
		s1.age = 25;
		//s1.id = 1;
		s1.votes = new byte[]{8, 10, 6, 1};
		
		s1.sayHello2();
		//System.out.println( s1.name + " " + s1.lastname );
		
		System.out.println( Arrays.toString( s1.votes ) );
		
		// s2
		Student s2 = new Student("l", "v", 3, new byte[]{8, 10, 6, 1});
		s2.sayHello2();
		
		Student s3 = s2;
		
		s3.name = "daisy";
		System.out.println( s2.name );
		System.out.println( s3.name );
		
		System.out.println( s3 == s2 );
		
		System.out.println( Student.school );
		System.out.println( s1.school );
		
		s2.school = "EpiSchool";
		System.out.println( s1.school );
		System.out.println( Student.school );	
		
		System.out.println( s1.planet );
		
		//s2.planet = "Venere";
		
		String st1 = "epicode";
		String st2 = new String( "epicode" );
		
		int x = 10;
		//System.out.println( x == st1 );
		
		System.out.println( st1 == st2 );
		
		String st3 = "epicode";
		System.out.println( st1 == st3 );
		
		String st4 = new String( "epicode" );
		System.out.println( st2 == st4 );
		
		System.out.println( st2.equals(st4) );
		
		Student student1 = new Student("luigi", "verdi", 30, new byte[]{8, 10, 6, 1});
		Student student2 = new Student("luigi", "verdi", 30, new byte[]{8, 10, 6, 1});
		
		System.out.println( student1 == student2 );
		System.out.println( "student1 e student2 sono equals? " + student1.equals(student2) );
		
	}

}

// classe
class Student {
	
	// attributi
	String name;
	String lastname;
	int age;
	int id;
	byte[] votes;
	
	private static int internalId = 1234;
	
	static String school = "Epicode";
	final static String planet = "Terra";
	
	// costruttori
	Student() {
		this.setId();
	}
	
	Student(String name, String _lastname, int age, byte[] votes) {
		
		this.setId();
		
		if( checkStringLength(name, 2) ) {			
			this.name = name;
		}
		else {
			printError( "nome", name, "troppo corto" );
		}
		
		if( checkStringLength(_lastname, 2) ) {			
			lastname = _lastname;
		}
		else {
			printError( "cognome", _lastname, "troppo corto" );
		}
		
		if( checkAge( age, 22, 90 ) ) {
			this.age = age;
		}
		else {
			printError( "età", "" + age, " fuori dal range consentito" );
		}
		
		this.votes = votes;
	}
	
	private void setId() {
		this.id = internalId++;
	}
	
	// metodi interni
	private boolean checkStringLength(String s, int l) {
		return ( s.length() >= l ) ? true : false;
	}
	
	private void printError(String field, String realField, String message) {
		System.out.println( "Warning: " + field + " è " + message + "! (" +realField+ ")" );
	}
	
	private boolean checkAge(int a, int left, int right) {
		return ( a >= left && a <= right ) ? true : false;
	}
	
	// metodi
	void sayHello() {
		System.out.println( "ciao, sono uno studente! Mi chiamo " + name + " " + this.lastname );
		
		int x = 10;
		if( x == 10 ) {							// inizio blocco
			int y = 20;
			System.out.println( x + y );
		}										// fine blocco
		
		System.out.println( x );
		//System.out.println( y );
		{
			int y = 20;
			System.out.println( x );
			
			{
				int z = 43;
				{
					if(z == 43) {
						
					}
				}
			}
		}
		//System.out.println( y );
	}
	
	void sayHello2() {
		//System.out.println( "ciao, sono uno studente! Mi chiamo " + name + " " + this.lastname + " e i miei voti sono: " );
		System.out.printf(
			"ciao, sono uno studente! ID matricola: %d. Mi chiamo %s %s (e ho %d anni) e i miei voti sono: %s %n",
			this.id, this.name, this.lastname, this.age, Arrays.toString( this.votes )
		);
		
		/*
		for(int i = 0; i < this.votes.length; i++) {
			System.out.println( "voto " + (i+1) + ": " + this.votes[i] );
		}
		*/
	}
	
	@Override
	public boolean equals(Object obj) {
	
		Student another = (Student)obj;
		return ( 
			this.name.equals(another.name) && 
			 this.lastname.equals(another.lastname) &&
			 this.age == another.age
		) ? true : false;
		
	}
	
}
