package review04Java;

import java.util.ArrayList;

public class Book {
	//field
	String title;
	String author;
	int publicationYear;
	String genre;
	int numberOfPages;	
	
	// Constructor (생성자)
	Book(String title, String author, int publicationYear, String genre, int numberOfPages){
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.genre = genre;
		this.numberOfPages = numberOfPages;
	}
	
	//메인메소드에서 메소드 호출하려고 만든 ??
	public Book() {
		}
	
	//Getter&Setter 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	Library library = new Library();
	
	// Methods 1 - Searching. Using "Title, Author, Genre" -> Accessing an ArrayList From Library class ->
	public void searchByTitle(Library libray , String title) {
//		if(libray.contains(title)) {
//			System.out.println("We have this book.");
//		}else {
//			System.out.println("We don't have this book");
//		}
	}
	// Method 2
	public void searchByTitle2(Library library, String title) {
		if(library.books.contains(title)) {
			System.out.println("We have this book");
		}else {
			System.out.println("We don't have this bool");
		}
	}
	
	// Title Method 먼저 수정 이후 수정
	public void searchByAuthor(ArrayList<Book> books, String author) {
		if(books.contains(author)) {
			System.out.println("We haeve this author.");
		}else {
			System.out.println("We don't have this author");
		}
	}
	
	public void searchByGenre(ArrayList<Book> books, String genre) {
		if(books.contains(genre)) {
			System.out.println("We haeve this genre.");
		}else {
			System.out.println("We don't have this genre.");
		}
	}
}
