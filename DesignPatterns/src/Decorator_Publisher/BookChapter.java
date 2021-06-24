package Decorator_Publisher;

public class BookChapter extends EditorsPublisher{

	public BookChapter(IPublisher newPublication) {
		super(newPublication);

		System.out.println("Adding new book chapter for Publication.");
		System.out.println("Required cover page of this book chapter.");
	}

	@Override
	public String getDescription() {	//Get method
		return super.tempPublisher.getDescription() + " Context description of book chapter and cover page.";
	}
	
	@Override
	public double getCost() {	//Get method
		return super.tempPublisher.getCost() + 15.0;
	}
	
	
	
	
}
