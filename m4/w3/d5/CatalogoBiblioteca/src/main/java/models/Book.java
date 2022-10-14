package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="books")
public class Book extends Item{

	private String author;
	
	private String genre;
	
	public Book() {}

	public Book(String title, String pubDate, int numPag, String author, String genre) {
		super(title, pubDate, numPag);
		
		this.author = author;
		this.genre = genre;
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", genre=" + genre + "]";
	}

		
	
	
}
