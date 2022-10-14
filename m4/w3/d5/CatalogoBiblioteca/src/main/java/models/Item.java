package models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "item_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int isbn;
	
	private String title;
	
	@Column(name = "pub_date")
	private String pubDate;
	
	@Column(name = "num_pag")
	private int numPag;
	
	@OneToOne(mappedBy = "itemLoaned")
	private Loan itemLoaned;
	
	public Item() {}

	public Item(String title, String pubDate, int numPag) {
		super();
		this.title = title;
		this.pubDate = pubDate;
		this.numPag = numPag;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	@Override
	public String toString() {
		return "Item [isbn=" + isbn + ", title=" + title + ", pubDate=" + pubDate + ", numPag=" + numPag + "]";
	}
	
	
}
