package review04Java;

public class EBook extends Book {
	//field
	String fileFormat;
	String downloadLink;
	
	//Constructor (생성자)
	EBook(String title, String author, int publicationYear, String genre, int numberOfPages) {
		super(title, author, publicationYear, genre, numberOfPages);
		this.fileFormat = fileFormat;
		this.downloadLink = downloadLink;
	}

	//Method : EBook의 상세정보
	void displayDetails() {
		
	}

}
