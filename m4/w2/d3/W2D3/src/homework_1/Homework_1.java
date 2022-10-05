package homework_1;
 

//properties > libraries > add Jar seleziona la libreria e toooooop 

public class Homework_1 {

	public static void main(String[] args) {
		
		myThread t1 = new myThread("#");
		myThread t2 = new myThread("*");
		
		// se usiamo implements runnable dobbiamo castare la nostra classe as Thread per avere accesso al metodo .start();
		Thread tr1 = new Thread(t1); 
		Thread tr2 = new Thread(t2); 
		
		// nonostante abbiamo overraidato il metodo run() ne richiamiamo il .start() per poter usufruire del multithreading <3
		tr1.start();
		tr2.start();
		
	}
	
}

class myThread implements Runnable{
	
	private static void print(Object a) {
		System.out.println(a);
	}
	
	String simbolo;
	
	public myThread(String simbolo){
		this.simbolo=simbolo;
	}

	@Override
	public void run() {

		for(int i = 0 ; i<10; i++) {
			print(simbolo);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}