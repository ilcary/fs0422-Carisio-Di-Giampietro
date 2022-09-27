
public class Esercizio1 {

	public static void main(String[] args) {
	
		Rettangolo r1 = new Rettangolo(12,32);
		Rettangolo r2 = new Rettangolo(21,23);
		Rettangolo r3 = new Rettangolo(11,33);
		
		gimmeRettangoli(r1,r2);
	

	}
		public static void gimmeRettangoli(Rettangolo ret1, Rettangolo ret2) {
			System.out.println( "Per il rettangolo 1: il perimetro è "+ ret1.perimetroRettangolo()+" l'area è "+ ret1.areaRettangolo());
			System.out.println( "Per il rettangolo 2: il perimetro è "+ ret2.perimetroRettangolo()+" l'area è "+ ret2.areaRettangolo());
			System.out.println("Somma delle aree e dei perimetri è "+ (ret1.perimetroRettangolo()+ret1.areaRettangolo()+ret2.perimetroRettangolo()+ ret2.areaRettangolo()));
		}
}

	class Rettangolo{
		int altezza;
		int larghezza;
		int perimetro;
		int area;
		Rettangolo(int altezza, int larghezza ){
			this.altezza = altezza;
			this.larghezza = larghezza;
			
		}
		
		public int perimetroRettangolo() {
			this.perimetro = (this.altezza+this.larghezza)*2;
			return this.perimetro;
		}
		
		public int areaRettangolo() {
			this.area = (this.altezza*this.larghezza);
			return this.area;
		}
		
		public void showMeRettangolo() {
			this.perimetroRettangolo();
			this.areaRettangolo();
		}
		
	}
