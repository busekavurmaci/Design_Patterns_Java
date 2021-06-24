package Decorator_Publisher;

public class JournalPaper extends EditorsPublisher{

	public JournalPaper(IPublisher newPublication) {
		super(newPublication);
		
		System.out.println("Journal paper is required accepted from 3 reviewers at least.");
	}

	@Override
	public String getDescription() {	//Get method
		return super.tempPublisher.getDescription() + " Published on first issue of journal.";
	}
	
	@Override
	public double getCost() {	//Get method
		return super.tempPublisher.getCost() + 43.50;
	}
	
}
