package Decorator_Publisher;

public abstract class EditorsPublisher implements IPublisher{

	protected IPublisher tempPublisher;
	
	public EditorsPublisher (IPublisher newPublication) {
		tempPublisher = newPublication;
	}
	
	public String getDescription() {
		return tempPublisher.getDescription();
	}
	
	public double getCost() {
		return tempPublisher.getCost();
	}
	

}
