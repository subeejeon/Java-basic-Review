package review04Java;

public class Main {
	public static void main(String[] args) {
	
	// Create objects of Book (Book 객체 생성) 
	Book book1 = new Book("A", "He", 2020, "Comic", 300);
	Book book2 = new Book("B", "She", 2021, "Horror", 400);
	Book book3 = new Book("C", "Me", 2022, "Thriller",500);
	
	// a Library instance
	Library library = new Library();
	library.addBook(book1);
	library.addBook(book2);
	library.addBook(book3);
	
	//a Book instance
	Book book = new Book();
	//Call method
//	book.searchByAuthor(null, null);
	
	}
}
