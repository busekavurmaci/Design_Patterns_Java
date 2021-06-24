package Decorator_Publisher;

public class ConferencePaper extends EditorsPublisher{

	@Override
	public String getDescription() {	//Get method
		return super.tempPublisher.getDescription() + " Add abstarct and presentation";
	}
	
	@Override
	public double getCost() {	//Get method
		return super.tempPublisher.getCost() + 20.0;
	}
	
	
	public ConferencePaper(IPublisher newPublication) {
		super(newPublication);
		
		System.out.println("Conference paper is required presentation and copyright.");
		System.out.println("Conference paper is also required 2 reviewers at least.");

	}

}
