package homework_2;

import java.util.ArrayList;
import java.util.Random;


public class Homework_2 {
	
	private static void print(Object a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer>  res = new ArrayList<>();
		
		Random random = new Random();

		for(int i = 1; i <= 3000; i++) {
			res.add(i);
		}//random.nextInt(101)
				
		myThread t1 = new myThread(0,res);
		myThread t2 = new myThread(1000,res);
		myThread t3 = new myThread(2000,res);
		
		// se usiamo implements runnable dobbiamo castare la nostra classe as Thread per avere accesso al metodo .start();
		Thread tr1 = new Thread(t1,"primo"); 
		Thread tr2 = new Thread(t2,"secondo"); 
		Thread tr3 = new Thread(t3,"terzo"); 
		
		
		
		// nonostante abbiamo overraidato il metodo run() ne richiamiamo il .start() per poter usufruire del multithreading <3
		tr1.start();
		tr2.start();
		tr3.start();
		
		
		try {
			tr1.join();
			tr2.join();
			tr3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		print("that's how hold a pistol "+myThread.totalSummetty);
		
	
	}

}

class myThread implements Runnable{
	
	int inizio;
	int fine;
	ArrayList<Integer> numeretty;
	int summetty;
	static int totalSummetty;
	
	public myThread(int inizio,ArrayList<Integer> numeretty){
		this.inizio = inizio;
		this.numeretty = numeretty;
		this.fine = inizio+1000;
	
		
	}
	
	public int getSummetty() {
		return summetty;
	}
	
	private static void print(Object a) {
		System.out.println(a);
	}

	@Override
	public void run() {
		
		 
		for(int i = inizio; i < this.fine; i++) {
			
			this.summetty += numeretty.get(i);
			// lesgo :)
				
		}
		this.totalSummetty +=summetty;
		print("that's "+" "+Thread.currentThread().getName()+" "+ summetty);
		print("--------------------------");
	}
	
	
}