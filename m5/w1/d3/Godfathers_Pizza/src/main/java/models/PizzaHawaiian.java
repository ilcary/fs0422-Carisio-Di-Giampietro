package models;

public class PizzaHawaiian extends Pizza {

	public PizzaHawaiian() {
		super("Hawaiian", 10d,400d);
		this.addTopping(new Ananas());
		this.addTopping(new Prosciutto());
	}

}
