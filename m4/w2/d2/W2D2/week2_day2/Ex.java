package week2_day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		words.add( "primo" );
		words.add( "secondo" );
		words.add( "terzo" );
		
		System.out.println( words );
		
		ArrayList<String> wordsClone = (ArrayList<String>)words.clone();
		
		System.out.println( wordsClone.get(0) );
		
		Person p1 = new Person("mario", 30);
		Person p2 = new Person("luigi", 20);
		
		ArrayList<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add( new Person("daisy", 34) );
		
		ArrayList<Person> peopleClone = (ArrayList<Person>)people.clone();
		
		System.out.println( people == peopleClone );
		
		peopleClone.get(0).name = "yoshi";
		
		System.out.println( people );
		System.out.println( peopleClone );
		
		System.out.println( words.contains("secondo") );
		
		System.out.println( people.contains(p1) );
		
		words.remove(0);
		System.out.println( words );
		
		people.remove( new Person("yoshi", 40) );
		System.out.println( people );
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add( 145 );
		numbers.add( -67 );
		numbers.add( 3 );
		numbers.add( 11 );
		
		System.out.println( numbers );
		
		numbers.remove(3);
		numbers.remove( new Integer(3) );
		System.out.println( numbers );
		
		List<String> words2 = new ArrayList<>();
		
		parseList( words2 );
		
		/*
		ArrayList objs = new ArrayList();
		objs.add( "ciao" );
		objs.add( 10 );
		objs.add( p1 );
		*/
		
		System.out.println("----------------------------------");
		ArrayList< ArrayList<String> > l2 = new ArrayList<>();
		l2.add( new ArrayList<>( Arrays.asList("red", "blue", "green") ) );
		l2.add( new ArrayList<>( Arrays.asList("white", "gray", "black") ) );
		l2.add( new ArrayList<>( Arrays.asList("rainbow") ) );
		
		for(int i = 0; i < l2.size(); i++) {
			System.out.println("Riga " + (i+1));
			
			for(int j = 0; j < l2.get(i).size(); j++) {
				System.out.print( l2.get(i).get(j) + " " );
			}
			System.out.println();
		}
		
		// ArrayList< HashMap<Integer, HashSet<String>> >
		
	}
	
	static void parseList(List<String> list) {
		
	}

}

class Person {
	String name;
	int age;
	
	Person(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	@Override
	public String toString() {
		return "'" + this.name + " " + this.age + "'";
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.name.equals( p.name ) && this.age == p.age + 10;
	}
}
