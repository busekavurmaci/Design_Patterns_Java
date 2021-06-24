package Builder_Meal;

public class VegBurger extends Burger{

	@Override
	public String name() {
		return "Vegetarian Burger";
	}

	@Override
	public float price() {
		return 4.7f;
	}

}
