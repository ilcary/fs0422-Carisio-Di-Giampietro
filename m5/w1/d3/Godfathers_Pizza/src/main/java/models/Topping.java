package models;

public class Topping extends FoodItem {
	
	public Topping(String n, double p, double c) {
		super(n, p, c);
	}
	
	public String toString() {
		return this.getNome() + " - " + this.getCalorie() + " - " + this.getPrezzo();
	}

}
