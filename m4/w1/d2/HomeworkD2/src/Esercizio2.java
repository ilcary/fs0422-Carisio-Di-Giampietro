
public class Esercizio2 {

	public static void main(String[] args) {

		Sim tim = new Sim(3337007,23,new Call[] {new Call(5,645374564),new Call(1,45364344),new Call(5,456343463),new Call(5,3745346)});
		Sim vodafone = new Sim(3282584,23,new Call[] {new Call(5,645374564),new Call(1,45364344),new Call(5,456343463),new Call(5,3745346)});
		System.out.println(tim.cellNum);
		System.out.println(vodafone.cellNum);
	}
	
	

}


 class Sim{
	int cellNum;
	int cresitoRes;
	Call[] registro;
	Sim(int cellNum, int creditoRes,Call[] registro){
		this.cellNum = cellNum;
		this.cresitoRes = creditoRes;
		this.registro = registro;
		
	}
	
	
	
	
}
 
  class Call{
	 int time;
	 int numCalled;
	 Call(int time, int numCalled){
		 this.time = time;
		 this.numCalled = numCalled;
	 }
 }

 
 