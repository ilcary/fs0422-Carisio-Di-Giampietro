package models;

public class Tavolo {
	
	private int id;
	private static int internalId=0;
	private StatoOrdine state;
	
	
	public Tavolo(StatoOrdine state) {
		this.id=internalId++;
		this.state = state;
	}
	
	public StatoOrdine getState() {
		return state;
	}
	public void setState(StatoOrdine state) {
		this.state = state;
	}
	public int getId() {
		return id;
	}
	
	

}
