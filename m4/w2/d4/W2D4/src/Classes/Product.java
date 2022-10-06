package Classes;

import Enums.Categories;

public class Product {

	private static int istances;
	private long id;

	private String name;
	private Categories category;
	private double price;

	public Product(String name, Categories category, double price) {
		this();
		this.setName(name);
		this.setPrice(price);
		this.setCategory(category);
	}

	private Product() {
		id = istances;
		istances++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getId() {
		return id;
	}
	
	@Override
	public String toString() {
	
		return getName()+" "+getPrice();
	}

}
