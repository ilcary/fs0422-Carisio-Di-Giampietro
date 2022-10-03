package Esercizio_m1w2d1;

public class StudentComparator {
	
	private Student s1;
	private Student s2;
	
	
	public StudentComparator(Student s1, Student s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public int compare() {
		
		if(s1.getMedia() > s2.getMedia()) {
			return 1;
		}
	    if(s1.getMedia() < s2.getMedia()) {
			return -1;
		}
		return 0;
		
	}

}
