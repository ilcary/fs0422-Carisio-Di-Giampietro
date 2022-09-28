package Hw3;

public class Hw3 {

	public static void stringify(String paroletty) {
		
		String[] arr = paroletty.split("");
		
		String res = String.join(",",arr);
		
		System.out.println(res);
	}

}
