package week2_day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex6 {

	public static void main(String[] args) {
		
		HashMap<String, String> m1 = new HashMap<>();
		m1.put("name", "luigi");
		m1.put("lastname", "verdi");
		m1.put("role", "developer");
		
		for(Map.Entry set : m1.entrySet()){
			System.out.println( "chiave: " + set.getKey() + " valore: " + set.getValue() );
	    }
		
		System.out.println( m1.values() );
		
		System.out.println( m1.get( "name" ) + " " + m1.get("lastname") );
		
		HashMap<String, ArrayList<Integer>> student1 = new HashMap<>();
		student1.put( "java" , new ArrayList<>(Arrays.asList(8, 7, 9)) );
		student1.put( "php" , new ArrayList<>(Arrays.asList(5, 6, 4)) );
		student1.put( "html" , new ArrayList<>(Arrays.asList(8, 2, 6)) );
		
		for(Map.Entry set : student1.entrySet()){
			
			System.out.println( "materia: " + set.getKey() + " voti: " + set.getValue() );
			
	    }
		
		EpicodeStudent s1 = new EpicodeStudent("peach", student1);
		System.out.println( "la media di java è: " + s1.getMedia("java") );
		System.out.println( "la media di php è: " + s1.getMedia("php") );

	}

}

class EpicodeStudent {
	
	String name;
	HashMap<String, ArrayList<Integer>> ratings = new HashMap<>();
	
	EpicodeStudent(String name, HashMap<String, ArrayList<Integer>> ratings) {
		this.name = name;
		this.ratings = ratings;
	}
	
	double getMedia(String topic) {
		double sum = 0;
		double l = 0;
		
		for(Map.Entry set : this.ratings.entrySet()){
			 if( topic.equals( set.getKey() ) ) {				 
				 ArrayList<Integer> r = (ArrayList<Integer>)set.getValue();	
				 l = r.size();
				 for( Integer rate : r ) {
					 sum += rate;
				 }
			 }
	    }
		
		return sum / l;
	}
	
}
