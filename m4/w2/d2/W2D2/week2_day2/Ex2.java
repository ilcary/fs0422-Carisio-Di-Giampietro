package week2_day2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ex2 {

	public static void main(String[] args) {
		
		LinkedList<String> l1 = new LinkedList<>();
		l1.add( "primo" );
		l1.add( "secondo" );
		l1.add( "terzo" );
		
		l1.addFirst( "zero" );
		l1.addLast( "quarto" );
		
		System.out.println( l1 );
		
		for(int i = 0; i < l1.size(); i++) {
			System.out.print( l1.get(i) + " " );
		}
		System.out.println();
		
		String firstElement = l1.peek();
		System.out.println( firstElement );
		
		//System.out.println( l1.poll() );
		//System.out.println( l1 );
		
		int s = l1.size();
		for(int i = 0; i < s; i++) {
			System.out.println( "ho rimosso \"" + l1.pollFirst() + "\"" );
			System.out.println( "situazione attuale: " + l1 );
			System.out.println("---------------");
		}
		
		/*
		Deque<String> l2 = new LinkedList<>();
		l2.add();
		*/

	}

}
