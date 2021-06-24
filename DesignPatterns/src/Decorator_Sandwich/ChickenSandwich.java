package Decorator_Sandwich;

public class ChickenSandwich extends SandwichDecorator{

	ISandwich sandwich;

	public ChickenSandwich(ISandwich sandwich) {
		super(sandwich);
		}

    @Override
    public String description() {
    return super.description() + "Chicken Sandwich";
    }
    
    @Override
    public int cost() {
    return super.cost() + 15;

    }
			
}
