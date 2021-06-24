package Decorator_Sandwich;

public class BasicSandwich implements ISandwich{

	@Override
	public String description() {
	return "Sandwich: \n";
	}

	@Override
	public int cost() {
    return 4;

	}
}
