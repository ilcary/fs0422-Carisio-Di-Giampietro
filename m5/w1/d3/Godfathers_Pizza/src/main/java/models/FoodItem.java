package models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class FoodItem extends Item {

	private double calorie;
	
	public FoodItem(String s, double p, double c) {
		super(s, p);
		this.calorie = c;
	}
	
}
