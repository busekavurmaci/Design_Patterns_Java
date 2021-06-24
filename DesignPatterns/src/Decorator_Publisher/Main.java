package Decorator_Publisher;

public class Main {

	public static void main(String[] args) {
		IPublisher totalPublication = new BookChapter(new ConferencePaper(new JournalPaper(new Publication())));

		System.out.println("** Several publications have been submitted in our publisher: "+ totalPublication.getDescription());
		System.out.println("** The total cost of 3 publications: " + totalPublication.getCost());
		
	}
}
