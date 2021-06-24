package Decorator_Publisher;

public class Publication implements IPublisher{

	@Override
	public String getDescription() {

		return "For submission you need to follow the description of out publisher.";
	}

	@Override
	public double getCost() {

		return 50.0;
	}

}
