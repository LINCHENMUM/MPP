package Book;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ChecoutRecordEntry {

	private Book book;
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	public ChecoutRecordEntry(Book copy, LocalDate checkoutDate, LocalDate dueDate) {
		this.book = copy;
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
	}
	
	public String toString(){
		String pattern ="MM/dd/yyyy";
		return "[" + book +" chckout date:"
				+ checkoutDate.format(DateTimeFormatter.ofPattern(pattern))
				+ " due date: "
				+ dueDate.format(DateTimeFormatter.ofPattern(pattern))+"]";
	}
	
	
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	
	
}
