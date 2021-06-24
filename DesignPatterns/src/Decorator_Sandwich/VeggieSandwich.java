package Decorator_Sandwich;

public class VeggieSandwich extends SandwichDecorator{

	ISandwich sandwich;

	public VeggieSandwich(ISandwich sandwich) {
		super(sandwich);
		}

	@Override
    public String description() {
    return super.description() + "Veggie Sandwich";
    }
    
    @Override
    public int cost() {
    return super.cost() + 10;

    }
}
