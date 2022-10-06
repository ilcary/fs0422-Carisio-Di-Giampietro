package homework_1;

import java.time.LocalDate;
import java.util.List;

public class Homework_1 {
	
	public static void main(String[] args) {
		
	}
	

}

class Product{
	
	private long id;
	private String name;
	private String category;
	private double price;
	
	public Product(long id,String name,String category,double price) {
		
		this.id= id;
		this.name=name;
		this.category=category;
		this.price=price;
		
	}
	
}

class Customer{
	
	private Long id;
	private String name;
	private Integer tier;
	
	Customer(Long id,String name,Integer tier ){
		
		this.id=id;
		this.name=name;
		this.tier=tier;
		
	}
	
}



class Order{
	
	private long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private List<Product> products;
	private Customer customer;
	
	public Order(long id,String status,LocalDate orderDate,LocalDate deliveryDate,List<Product> products,Customer customer) {
		
		this.id=id;
		this.status=status;
		this.orderDate=orderDate;
		this.deliveryDate=deliveryDate;
		this.products=products;
		this.customer=customer;
		
	}
	
}
