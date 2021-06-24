package Composite_Book;

public class Book extends BookComponent{

	String bookName;
	String categoryName;
	int yearOfPublication;
	
	public Book(String bookName, String categoryName, int yearOfPublication) {
		this.bookName = bookName;
		this.categoryName = categoryName;
		this.yearOfPublication = yearOfPublication;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public String getBookCategory() {
		return categoryName;
	}
	
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	
	public void displayBookInfo() {
		System.out.println(getBookName() + " was published by " + getBookCategory() + " ISBN " + getYearOfPublication());
	}
	
}
