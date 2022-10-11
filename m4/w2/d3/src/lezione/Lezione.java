package lezione;

import java.util.function.Function;
import java.util.function.Predicate;

public class Lezione {
	
	//.charAt(str.length() - 1)

	public static void main(String[] args) {
	
	   Predicate<String> isPalindrometty=(s)->{
		   String reversetty =  new StringBuilder(s).reverse().toString();
	        return  s.equals(reversetty);
	   };
	   
	   System.out.println(isPalindrometty.test("otto"));
	   System.out.println(isPalindrometty.test("angolobarabologna"));

	   Function<String, Character> lastChar = (s) -> s.charAt(s.length() - 1);
	   System.out.println(lastChar.apply("otto"));
	   
	   
	
	
	

}


}







