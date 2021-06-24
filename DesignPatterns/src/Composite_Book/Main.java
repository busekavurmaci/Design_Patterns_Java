package Composite_Book;

public class Main {

	public static void main(String[] args) {
		
		BookComponent bookSWEng = new BookGroup("Software Engineering", "This is a category will covered the most important references in software engineering.");
		BookComponent bookDS = new BookGroup("Data Science", "It covered the latest references of data science books.");
		BookComponent bookCS = new BookGroup("Computer Science", "The most popular references in computer science.");
		BookComponent allReferences = new BookGroup("List of references", "All important references");
		
		allReferences.add(bookSWEng);
		bookSWEng.add(new Book("Design Pattern", "Software", 2019));
		bookSWEng.add(new Book("Software development", "System development", 2020));
		
		bookCS.add(bookDS);
		bookDS.add(new Book("Machine Learning", "Data Science", 2020));
		bookDS.add(new Book("Deep Learning", "Artificial Intelligent", 2019));
		
		allReferences.add(bookCS);
		bookCS.add(new Book("Image Processing", "Science", 2014));
		bookCS.add(new Book("Data Compression", "Science", 2017));
		
		IEEEPublisher ieeePublisher = new IEEEPublisher(allReferences);
		ieeePublisher.getBookList();

	}

}
