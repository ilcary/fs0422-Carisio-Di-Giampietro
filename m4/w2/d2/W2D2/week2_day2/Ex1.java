package week2_day2;

public class Ex1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		Animal obj1 = new Dog();
		((Dog)obj1).corri();
		
		int x = 10;

	}

}

class Animal {
	
	@Deprecated
	public void verso() {
		System.out.println( "verso" );
	}
	
}

class Dog extends Animal {
	
	
	public void corri() {
		System.out.println( "dog::corri" );
	}
	
	
	
}
