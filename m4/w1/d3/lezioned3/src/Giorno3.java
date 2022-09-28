import week1_day3.Class1;
import week1_day3.animals.Dog;
import java.util.*;
//import week1_day3.mammals.*;

public class Giorno3 {

	public static void main(String[] args) {
		
		Class1 a = new Class1();
		//System.out.println( a.x );
		a.stampaSomma();
		
		//week1_day3.animals.Dog dog1 = new week1_day3.animals.Dog();
		Dog dog1 = new Dog();
		System.out.println( dog1.name + " " + dog1.age );
		
		week1_day3.mammals.Dog dog2 = new week1_day3.mammals.Dog();
		System.out.println( dog2.breed );
		
		/*
		 * www.riccardodegni.com
		 * 
		 * animals
		 * Dog
		 * 
		 * com.riccardodegni.animals.Dog
		 */
		
		String color = "blue";
		
		if( color.equals("blue") ) {
			System.out.println("a");
		}
		else if( color.equals("red") ) {
			System.out.println("b");
		}
		else if( color.equals("green") ) {
			System.out.println("c");
		}
		else {
			System.out.println("d");
		}
		
		System.out.println("---------------------");
		
		color = "white";
		switch( color ) {
			default:
				System.out.println("d");
		
			case "blue":
				System.out.println("a");
			//break;
			
			case "red":
				System.out.println("b");
			//break;
			
			case "green":
				System.out.println("c");
			//break;
		}
		
		int x = 10;
		switch( x ) {
			case 10:
				System.out.println( "here" );
				break;
		}
		
		System.out.println("---------------------");
		for(int i = 1; i <= 10; i++) {
			if( i == 4 ) continue;
			System.out.println( i );
		}
		
		
		
	}

}
