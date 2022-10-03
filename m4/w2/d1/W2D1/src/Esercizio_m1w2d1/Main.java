package Esercizio_m1w2d1;

import java.util.Scanner;

public class Main {

//	Avendo la classe Student (name, votes[3])
//	creare una classe chiamata StudentComparator con il metodo:
//	compare(Student s1, Student s2) che restituisce 1 se s1 ha una media migliore, -1 se s2 ha una media migliore e 0 se hanno media voti uguale
//
//	Chiedere all'utente di inserire 3 voti e un nome per entrambi gli studenti. 
//	Controllare che: 
//	il nome abbia lunghezza compresa tra 3 e 10
//	ogni voto sia nel range 1 - 10
//
//	Gestisci ogni condizione di errore con un'apposita strategia.

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		print("inserisci un nome da tre caratteri a dieci");

		String nome = "";

		while (true) {
			try {

				nome = in.nextLine();

				int l = nome.length();
				if (l < 3 || l > 10) {
					throw new StudentNameException("Il nome non rientra nel range", nome);

				}
				break;
			} catch (StudentNameException e) {
				print("Errore: " + e.getMessage() + " valore fornito: hai inserito " + e.getErrName());

			}
		}

		print("Inserisci tre voti");

		int[] voti = new int[3];

		for (int i = 0; i < 3; i++) {

			try {
				int voto = Integer.parseInt(in.nextLine());
				if (voto < 0 || voto > 10) {
					throw new StudentVoteException("Il voto non rientra nel range", voto);
				}
				voti[i] = voto;
			} catch (NumberFormatException e) {
				print(e.getMessage());
			} catch (StudentVoteException e) {
				print(e.getMessage());
			}

		}

		Student s1 = new Student(nome, voti);

		Student s2 = new Student("pippo", new int[] { 4, 5, 6 });

		StudentComparator sc = new StudentComparator(s1, s2);

		int res = sc.compare();

		switch (res) {

		case 1:
			print("Lo studente migliore è: " + s1.getName());
			break;
		case -1:
			print("Lo studente migliore è: " + s2.getName());
			break;
		default:
			print("gli studenti sono alla pari");
		}

		in.close();
	}

	private static void print(Object a) {
		System.out.println(a);
	}

}
