package review04Java;

import java.util.ArrayList;

public class Library {
	
	// To store books
	public ArrayList<Book> books;
	
	//Book에서 메소드 실행하기 위한 생성자 , ArrayList에 접근하기 위함
	/**
	public Library() {
		this.books = new ArrayList<Book>();
	}
	*/
	
	//ArrayList - setter & getter
	public void setArrayList(ArrayList books) {
		this.books = books;
	}
	public ArrayList getArrayList() {
		return books;
	}
	
	//Method: add book to ArrayList
	public void addBook(Book book){
		books.add(book);
	}
	
	//Method: update book in ArrayList
	void updateBook(Book book) {
		books.add(books.lastIndexOf(books), book);
	}
	
	void removeBook(Book book) {
		books.remove(book);		
	}
	
	// CheckOut Method <-> searchBy title, author, genre
	void checkOutBook(Book book) {
	}
	void checkInBook() {
	}

}
