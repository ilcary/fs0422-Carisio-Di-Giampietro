package Classes;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Order {

	private static int istances;
	private long id;

	private String status;
	private LocalDate orderDate = LocalDate.now();
	private LocalDate deliveryDate;
	private List<Product> products;
	private Customer customer;

	public Order(String status, LocalDate deliveryDate, List<Product> products, Customer customer) {
		this();
		this.setDeliveryDate(deliveryDate);
		this.setProducts(products);
		this.customer = customer;

	}

	private Order() {
		id = istances;
		istances++;
	}

	public long getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Customer getCustomer() {
		return customer;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}
	
	@Override
	public String toString() {
	
		return "ciao";
	}

}
