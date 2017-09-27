package e;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Main1 {

	
	
	
	
	public static void main(String[] args) {
		List<Book> allBooks = Arrays.asList(new Book("28-12331", "Solaris", 7, 10.00, Genre.ROMANCE),
				new Book("28-12332", "Linnea Sincair", 7, 20.00, Genre.ROMANCE),
				new Book("28-12333", "Alien", 7, 20.00, Genre.ROMANCE),
				new Book("99-22223", "Thinking java", 21, 30.99, Genre.IT),
				new Book("58-33331", "Wraeththu", 12, 35.88, Genre.SCIFICTION),
				new Book("58-33332", "Solw River", 12, 35.88, Genre.SCIFICTION),
				new Book("48-12331", "Jimay's First Day of School", 7, 15.88, Genre.COMEDY));

		List<ChecoutRecordEntry> allEntries = Arrays.asList(
				new ChecoutRecordEntry(allBooks.get(0), LocalDate.of(2011, 12, 1), LocalDate.of(2011, 12, 22)),
				new ChecoutRecordEntry(allBooks.get(0), LocalDate.of(2014, 6, 22), LocalDate.of(2014, 7, 13)),
				new ChecoutRecordEntry(allBooks.get(1), LocalDate.of(2015, 12, 2), LocalDate.of(2015, 12, 23)),
				new ChecoutRecordEntry(allBooks.get(2), LocalDate.of(2016, 1, 1), LocalDate.of(2016, 2, 3))

		);

		

		
		System.out.println("\n 2---------------");
		allEntries.stream().filter(d->d.getDueDate().equals(LocalDate.of(2016, 2, 3)))
		.sorted(Comparator.comparing(ChecoutRecordEntry::getCheckoutDate)).collect(Collectors.toList());
		
		System.out.println("\n 3---------------");
		
		String aa = allBooks.stream().filter(b->b.getGenre() == Genre.ROMANCE)
		.map(Book::getTitle).sorted().collect(Collectors.joining(", "));
		System.out.println(aa);
		
		System.out.println("\n 4---------------");
		System.out.println(allEntries.stream().map(ChecoutRecordEntry::getBook)
		.map(Book::getPrice)
//		.reduce(Double.MAX_VALUE,Double::min));
		.reduce(Double.MAX_VALUE,(b1, b2) -> Double.min(b1,b2)));
		
		
		
		
		System.out.println("\n 5---------------");
		String title = FILTER_BY_GENRE.apply(allEntries,Genre.ROMANCE);
		System.out.println(title);
		

		
	}
	
	
	final static BiFunction<List<ChecoutRecordEntry>, Genre, String> FILTER_BY_GENRE 
			= (list, genre) -> list.stream()
			.filter(d -> d.getBook().getGenre() == genre)
			.map(entry -> entry.getBook().getTitle())
			.collect(Collectors.joining(","));
	
}
