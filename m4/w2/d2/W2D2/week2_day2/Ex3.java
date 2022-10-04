package week2_day2;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3 {

	public static void main(String[] args) {
		
		HashSet<String> s1 = new HashSet<>();
		s1.add( "primo" );
		s1.add( "secondo" );
		s1.add( "terzo" );
		s1.add( "quarto" );
		s1.add(null);
		s1.add( "quarto" );
		
		for(String el : s1) {
			//s1.add("quinto");
			System.out.println( el );
		}
		
		/*
		for(int i = 0; i < s1.size(); i++) {
			s1.add("quinto");
			System.out.println( s1 );
		}
		*/
		
		System.out.println("---------------------");
		Iterator<String> i1 = s1.iterator();
		while( i1.hasNext() ) {
			//s1.add("quinto");
			System.out.println( i1.next() );
		}

	}

}
