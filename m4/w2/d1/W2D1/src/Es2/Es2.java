package Es2;

import java.util.Scanner;

public class Es2 {

	private static void print(Object a) {
		System.out.println(a);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int km = 0;
		int lt = 0;

		print("Inserisci i km percorsi");

		try {

			km = Integer.parseInt(in.nextLine());
			if (km < 0) {

				throw new Exception("Non puoi percorrere i km negativamente");
			}
			print("Inserisci i litri consumati");

			try {

				lt = Integer.parseInt(in.nextLine());
				if (lt < 0) {
					throw new Exception("Non puoi aver consumato litri in negativo");
				}
				double result = 0;

				try {
					result = km / lt;
					print("Consumo: " + result + " km/lt");
				} catch (ArithmeticException e) {
					print(e.getMessage());
				}

				
			} catch (NumberFormatException e) {
				print(e.getMessage());
			} catch (Exception e) {
				print(e.getMessage());
			}

		} catch (NumberFormatException e) {
			print(e.getMessage());
		} catch (Exception e) {
			print(e.getMessage());
		}
		
		print("Fine del programma");

		in.close();

	}

}
