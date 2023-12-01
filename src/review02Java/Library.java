package review02Java;

// Library class is responsible for managing a collection of books. 
public class Library {
	//Arrays to store book
	Book[] books;
	
	// Constructor to initialize the Library with a specified size
	Library(int size){
		this.books = new Book[size];
	}
	
	// Method: to add a book to the library
	void addBook(Book book) {
		for(int i=0; i<books.length; i++) {
			if(books[i] == null) {
				books[i] = book;
				return;
			}
		}
	}
	// Static Method: prints the details of individual books in an array of books
	static void printsDetailsofLibrary(Book[] books) {
		for(Book book: books) {
			book.displayBookTitle();
		}
	}
	// Method to find and return the book with the highest book ID
	Book findHighestBookId() {
		Book highstBook = null;
		for(Book book : books) {
			if( highstBook.bookID < book.bookID) 
			highstBook = book;
		}	
	return null;
	}
}