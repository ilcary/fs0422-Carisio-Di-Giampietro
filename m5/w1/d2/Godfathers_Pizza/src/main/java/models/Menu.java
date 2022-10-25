package models;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Menu {

	String nome;
	List<Pizza> pizze = new ArrayList();
	List<Drink> drinks = new ArrayList();
	List<Topping> toppings = new ArrayList();
	List<Merchandise> merch = new ArrayList();
	List<Pizza> custom = new ArrayList();
	
	public Menu(String n) {
		this.nome = n;

		this.pizze.add(new PizzaMargherita());
		this.pizze.add(new PizzaHawaiian());
		
		
		PizzaBase p = new PizzaBase();
		p.addTopping(new Pomodoro());
		p.addTopping(new Mozzarella());
		p.addTopping(new Mozzarella());
		p.addTopping(new Prosciutto());
		
		custom.add(p);
		
		Pizza p1 = new PizzaHawaiian();
		p1.addTopping(new Mozzarella());
		this.custom.add(p1);
	}
	
	public String toString() {
		String res = "MENU - " + this.getNome(); 
		res += "***PIZZE***\n";
		for(int i = 0; i < this.pizze.size(); i ++) {
			res += pizze.get(i);
			res += "\n";
		}res += "***DRINKS***\n";
		for(int i = 0; i < this.drinks.size(); i ++) {
			res += drinks.get(i);
			res += "\n";
		}res += "***MERCH***\n";
		for(int i = 0; i < this.merch.size(); i ++) {
			res += merch.get(i);
			res += "\n";
		}res += "***TOPPINGS***\n";
		for(int i = 0; i < this.toppings.size(); i ++) {
			res += toppings.get(i);
			res += "\n";
		}res += "***CUSTOM***\n";
		for(int i = 0; i < this.custom.size(); i ++) {
			res += custom.get(i);
			res += "\n";
		}
		
		return res;
	}

}
