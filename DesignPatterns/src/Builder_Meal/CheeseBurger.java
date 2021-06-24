package Builder_Meal;

public class CheeseBurger extends Burger{

	@Override
	public String name() {
		return "Cheese Burger";
	}

	@Override
	public float price() {
		return 5.5f;
	}

}
