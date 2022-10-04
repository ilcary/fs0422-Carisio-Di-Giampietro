package week2_day2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Ex5 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> q1 = new PriorityQueue<>(10, new Q1Comparator());
		q1.add(78);
		q1.add(65);
		q1.add(-54);
		q1.add(4);
		
		while( q1.size() != 0 ) {
			System.out.println( q1.poll() );
		}

	}

}

class Q1Comparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		if( o1 > o2 ) return 1;
		else if( o1 < o2 ) return -1;
		
		return 0;
	}
}
