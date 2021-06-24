package Factory_Pizza;

public class ChickenPizza extends Pizza{

	public ChickenPizza() {
		name = "Chicken Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		toppings.add("Sliced Pepperoni");
		toppings.add("Grated parmesan cheese");
	}
}
