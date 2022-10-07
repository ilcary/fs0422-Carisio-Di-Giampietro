package AbstractBook;

public abstract class Browsable {
	
	private static int progressiveISBN;
	private String ISBN;
	private String titolo;
	private String yearPublished;
	private int pages;
	
	public Browsable(String titolo, String yearPublished, int pages) {
		this.progressiveISBN++;
		this.ISBN=progressiveISBN+"";
		this.titolo=titolo;
		this.yearPublished=yearPublished;
		this.pages=pages;
	}

	public String getISBN() {
		return this.ISBN;
	}
	
	public String getTitolo() {
		return this.titolo;
	}
	
	public String getYearPublished() {
		return this.yearPublished;
	}

	public int getPages() {
		return this.pages;
	}
	
	@Override
	public String toString() {
		return "|| " + titolo + " del "+yearPublished + ", ISBN: " + ISBN;
	}


}
