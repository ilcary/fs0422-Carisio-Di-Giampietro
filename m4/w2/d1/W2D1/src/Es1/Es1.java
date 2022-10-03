package Es1;

import java.util.Arrays;
import java.util.Scanner;

public class Es1 {

	private static void print(Object a) {
		System.out.println(a);
	}

	public static void main(String[] args) {

		int[] array = new int[5];

		for (int i = 0; i < 5; i++) {
			array[i] = (int) (Math.floor(Math.random() * (10 - 1)) + 1);
		}

		print(Arrays.toString(array));

		Scanner in = new Scanner(System.in);

		print("Scrivi la posizione dove effettuare una modifica all'array ");

		int o = 1;

		while (o != 0) {

			try {

				int p = Integer.parseInt(in.nextLine());
				if (p == 0) {
					o = p;
					break;
				}
				if (p < 1 || p > 6) {
					throw new Exception("La posizione non rientra nel range");
				}
				print("Scrivi un numero da 1 a 10 ");

				try {
					int n = Integer.parseInt(in.nextLine());
					if (n < 1 || n > 10) {
						throw new Exception("Il numero non rientra nel range");
					}
					array[p - 1] = n;
				} catch (NumberFormatException e) {
					print(e.getMessage());
				} catch (Exception e) {
					print(e.getMessage());
				}

			} catch (NumberFormatException e) {
				print(e.getMessage());
			} catch (Exception e) {
				print(e.getMessage());
			} finally {
				if (o == 0) {
					print("Arrivederci");
					break;
				}
				print(Arrays.toString(array));
				print("Scrivi la posizione dove effettuare una modifica all'array ");

			}
		}
		in.close();
	}

}
