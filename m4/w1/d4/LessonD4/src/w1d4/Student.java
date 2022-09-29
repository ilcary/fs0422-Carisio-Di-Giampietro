package w1d4;

public class Student {
	
	private String name;
	private String lastname;
	private int age;
	private String address;
	private StudentGender gender;
	
	//costruttore
	public Student(int a, String n, String addr, StudentGender gen){
		this(a);
		this.setName(n);
		this.setAddress(addr);
		this.setGender(gen);
	}	
	
	public Student(int a) {
		this.setAge(a);
	}
	
	//getter 
	public String GetName() {
		return this.name;
	}
	
	public int age(){
		return this.age;
	}
	
	//setter
	
	public void setAge(int a) {
		if(a>0 && a<120) {
			this.age=a;
			return;
		}
		printError("età non accettabile");
	}
	
	public void setAddress(String addr) {
		if( addr.length() > 1) {
			this.address=addr;
			return;
		}
		printError("Indirizzo non accettabile");
		}
	
	public void setGender(StudentGender gen) {
		if( gen.length() > 1) {
			this.address=gen;
			return;
		}
		printError("Gender non accettabile");
		}
	
	
	public void setName(String n) {
		if( n.length() > 1) {
			this.name=n;
			return;
		}
		printError("nome non accettabile");
		}
	
	
		//metodi
		public void hello(){
			System.out.printf("Ciao, sono lo studente %s e ho %d anni %n", this.name , this.age);
		}	
		
		//metodi interni
		private void printError(String msg) {
			System.out.println(msg);
		}
		
		
	
	
}











