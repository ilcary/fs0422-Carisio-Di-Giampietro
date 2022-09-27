
public class Lezioned2 {
	
	
	public static void main(String[]args) {
		
	//creazione istanza
		//s1
	Student s1 = new Student();
			s1.name= "Mario";
			s1.lastname="Rossi";
			s1.age=19;
			s1.id=1;
			s1.votes= new byte[] {8,7,6};
			
			s1.sayHello2();
			
			//2
			Student s2 = new Student();
			s2.name= "Luigi";
			s2.lastname="Verdi";
			s2.age=26;
			s2.id=2;
			s2.votes= new byte[] {8,7,6,10,1};
			
			s2.sayHello2();


	}
}


class Student{
	String name;
	String lastname;
	int age;
	int id;
	byte[] votes;
	
	void sayHello() {
		System.out.println("ciao, sono uno studente! Mi chiamo"+this.name+ " " +this.lastname);
	}


void sayHello2() {
	System.out.printf(
			"ciao, sono uno studente! Mi chiamo %s %s (e ho %d anni) e i miei voti sono: %n",
			this.name, this.lastname, this.age
			);
	for (int i=0;i<this.votes.length;i++) {
		System.out.println(this.votes[i]);
	}
}
}
