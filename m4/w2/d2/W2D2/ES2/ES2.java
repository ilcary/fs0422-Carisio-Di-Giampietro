package ES2;

import java.util.*;


public class ES2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> reverse = new ArrayList<>();
		ArrayList<Integer> pariDisp = new ArrayList<>();
		
		System.out.println("Quanti numeri vuoi generare?");
		
		boolean bool = true;
		int quanti = 0;
		
		while(bool)
		try {
			quanti = Integer.parseInt(in.nextLine());			
		}
		catch(NumberFormatException nfe) {
			System.out.println(nfe);
		}
		finally {
			if(quanti > 0) {
				bool = false;
			}
			System.out.println("Quanti numeri vuoi generare?");
		}
		
		numbers = creaList(quanti);
		
		System.out.println("Metodo 1: " + numbers);
		
		reverse = invertiList(numbers);
		
		System.out.println("Metodo 2: " + reverse);
		

		pariDisp = pariDispari(numbers, true);
		
		System.out.println("Metodo 3 (PARI): " + pariDisp);

		pariDisp = pariDispari(numbers, false);
		
		System.out.println("Metodo 3 (DISPARI): " + pariDisp);
		
		in.close();
	}

	public static ArrayList<Integer> creaList(int n) {
		
		ArrayList<Integer> res = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i = 1; i <= n; i++) {
			res.add(random.nextInt(101));
		}
		
		//wow
		Collections.sort(res);
		
		return res;
	}
	
	
	public static ArrayList<Integer> invertiList(ArrayList<Integer> list){
		
		ArrayList<Integer> clone = new ArrayList<>(list);
		ArrayList<Integer> clone2 = new ArrayList<>(list);
				
		Collections.reverse(clone);
		
		for(int i = 0; i < clone.size(); i++) {
			clone2.add(clone.get(i));
		}
		
		return clone2;
	}
	
	
	public static ArrayList<Integer> pariDispari(ArrayList<Integer> list, boolean bool) {

		ArrayList<Integer> res = new ArrayList<>();

		if (bool == true) {
			for (int i = 0; i < list.size(); i += 2) {
				res.add(list.get(i));
			}
		}else {			
			for (int i = 1; i < list.size(); i += 2) {
				res.add(list.get(i));
			}
		}


		return res;
	}
}
