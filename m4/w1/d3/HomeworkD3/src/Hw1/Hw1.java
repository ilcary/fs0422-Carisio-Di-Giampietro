package Hw1;

public class Hw1 {
	
	public static boolean strPariDispari(String parola) {
		int parDis = parola.length() % 2;
		
		if(parDis==0) 
		return true;
		else 
		return false;
		
	}
	
	public static boolean annoBisestile(int anno) {
		
		if(anno % 4==0) 
		return true;
		else 
		return false;
	}
	
	

}
