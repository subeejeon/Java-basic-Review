package review02Java;
// Book class is responsible for representing the properties 
// and behavior of an individual book.

public class Book {
	
	String title;
	String author;
	final int bookID;
	static int lastbookID = 0;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
		this.bookID = ++lastbookID;
	}
	
	void displayBookTitle() {
		 System.out.printf("Book ID: %d, Title: %s, Author: %s%n", bookID, title, author);
	}
}