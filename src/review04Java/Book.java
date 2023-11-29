package review04Java;

public class Book {	
	String title;
	String author;
	int publicationYear;
	String genre;
	int numberOfPages;
	
	final String isbn = "isbn";
	Boolean isAvailable  = true;

	Book(String title, String author, int publicationYear, String genre, int numberOfPages, Boolean isAvailable)	{
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.genre = genre;
		this.numberOfPages = numberOfPages;
		}
	
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

	public Boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable() {
		this.isAvailable = isAvailable;
	}
	
	void searchBookbyTitle() {
		}
	@Override
	public String toString() {
		return this.title + this.author + this.genre + this.publicationYear + this.numberOfPages;
	}
}
