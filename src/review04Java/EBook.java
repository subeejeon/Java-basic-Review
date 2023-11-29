package review04Java;

public class EBook extends Book {
	String fileFormat;
	String downloadLink;	
	
	EBook(String title, String author, int publicationYear, String genre, int numberOfPages, Boolean isAvailable) {
		super(title, author, publicationYear, genre, numberOfPages, isAvailable);
		
		}
	}
