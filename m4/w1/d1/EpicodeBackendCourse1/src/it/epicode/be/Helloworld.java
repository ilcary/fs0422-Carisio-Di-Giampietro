package it.epicode.be;

import java.util.Arrays;

public class Helloworld {

	public static void main(String[] args) {
		// Stampa a console la frase

		String[] arr = { "uno", "due", "tre", "quattro", "cinque" };

		String str = "impostor";

		System.out.println("This is my first Epicode Java Project!");
		System.out.println(moltiplica(7, 3));
		System.out.println(concatena("cuccioli ", 3));
		System.out.println(Arrays.toString(inserisciInArray(arr, str)));
	}

	public static int moltiplica(int x, int y) {
		return (x * y);

	}

	public static String concatena(String a, int b) {
		return (a + b);
	}

	public static String[] inserisciInArray(String[] strArr, String str) {
		String[] res = { strArr[0], strArr[1], strArr[2], str, strArr[3], strArr[4] };
		
		return res;
		
	}

}
