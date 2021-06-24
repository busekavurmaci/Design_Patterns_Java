package Decorator_Sandwich;

public abstract class SandwichDecorator implements ISandwich{

	private ISandwich decoratedSandwich;
	
	public SandwichDecorator(ISandwich sandwich) {
	this.decoratedSandwich = sandwich;
	}

	@Override
	public String description() {
	return decoratedSandwich.description();
	}

	@Override
	public int cost() {
	return decoratedSandwich.cost();
	}

	}

