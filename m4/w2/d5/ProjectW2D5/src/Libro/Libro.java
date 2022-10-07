package Libro;

import AbstractBook.Browsable;
import GestioneLibri.Type;

public class Libro extends Browsable {
	
	private String author;
	private Type type;
		
	public Libro(String titolo, String yearPublished, int pages, String author, Type type) {
		super(titolo,yearPublished,pages);
		this.author=author;
		this.type=type;	
	}

	public String getAuthor() {
		return this.author;
	}
	
	public Type getType() {
		return this.type;
	}

	@Override
	public String toString() {
		return "|| Libro: " + getTitolo()+", di "+ author + ", ISBN: " + getISBN();
	}



}
