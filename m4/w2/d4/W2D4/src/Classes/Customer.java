package Classes;

public class Customer {
	
	private static int istances;
	private long id;
	
	private String name;
	private int tier;

	public Customer(String name, int tier) {
		this();
		setTier(tier);
		setName(name);
		
	}
	private Customer() {
		id = istances;
		istances++;
	}
	
	public long getId() {
		return id;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
	
		return getName();
	}
}
