package gy_test.ffinal.e;

public class Book {
	
	private String isbn;
	private String title;
	private int maxCheckoutLength;
	private double price;
	private boolean isAvailable;
	private Genre genre;
	
	public Book(String isbn, String title, int maxCheckoutLength, double price, /*boolean isAvailable,*/ Genre genre) {
		this.isbn = isbn;
		this.title = title;
		this.maxCheckoutLength = maxCheckoutLength;
		this.price = price;
		//this.isAvailable = isAvailable;
		this.genre = genre;
	}

	public String toString() {
		return "Book [isbn=" + isbn + ",title=" + title + ", maxCheckoutLength=" + maxCheckoutLength + ", price="
				+ price + ", isAvailable=" + isAvailable + ", genre=" + genre + "]";
	}
	
	
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMaxCheckoutLength() {
		return maxCheckoutLength;
	}

	public void setMaxCheckoutLength(int maxCheckoutLength) {
		this.maxCheckoutLength = maxCheckoutLength;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
}
