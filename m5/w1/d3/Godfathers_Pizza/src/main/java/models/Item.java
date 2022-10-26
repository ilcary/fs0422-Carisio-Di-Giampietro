package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Item {

	private String nome;
	private double prezzo;
	
	public Item(String n, double p) {
		this.nome = n;
		this.prezzo = p;
	}
	

}
