package review02Java;

public class Main {
	public static void main(String[] args) {

	Library obejectLibrary = new Library(3);
	
	//Object
	Book book1 = new Book("A", "Me");
	Book book2 = new Book("B", "She");
	Book book3 = new Book("C", "He");
	
	obejectLibrary.addBook(book1);
	obejectLibrary.addBook(book2);
	obejectLibrary.addBook(book3);

	Library.printsDetailsofLibrary(obejectLibrary.books);
	// length of books array
	System.out.println(obejectLibrary.books.length);	
	}
}