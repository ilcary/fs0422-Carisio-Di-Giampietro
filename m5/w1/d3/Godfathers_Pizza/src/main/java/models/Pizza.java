package models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza extends FoodItem {
	
	List<Topping> ingredienti = new ArrayList();
	
	private boolean familySize = false;
	
	public Pizza(String n, double d, double c) {
		super(n, d, c);
	}
	
	public void addTopping(Topping t ) {
		this.ingredienti.add(t);
	}

	public double getPrezzoTotale() {
		double res = this.getPrezzo();
		for(int i = 0; i < ingredienti.size(); i++) {
			res += ingredienti.get(i).getPrezzo();
		}
		return res;
	}
	public double getCalorieTotali() {
		double res = this.getPrezzo();
		for(int i = 0; i < ingredienti.size(); i++) {
			res += ingredienti.get(i).getCalorie();
		}
		return res;
	}
	public List<Topping> getTuttiIngredienti() {
		List<Topping> res = new ArrayList();
		res.add(new Mozzarella());
		res.add(new Pomodoro());
		
		
		return Stream.concat(res.stream(), ingredienti.stream()).collect(Collectors.toList());
	}
	
	
	public String toString() {
		String res = "****\n";
		if(this.isFamilySize() == true) {
			res += "Family sized ";
		}
		res += this.getNome() + "\nIngredienti:\n";
		for(int i = 0; i < this.getTuttiIngredienti().size(); i++) {
			res += this.getTuttiIngredienti().get(i) +"\n";
		}
		res += "prezzo: " + this.getPrezzoTotale();
		res += "cal: " + this.getCalorieTotali();
		return res;
	}
 
}
