package State_Pizza;

public class NonVeggiePizza extends Pizza{
	
	String[] meatUsed = {"slice Chicken", "slice Beef", "Sausage"};
	String[] cheeseUsed = {"Cottage", "Parmesan", "Mozarella"};
	String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions","Sweet Peppers"};
	String[] condimentUsed = {"Olive Oil", "Spicy", "Masala","Back Peppers","Paprika"};
	

	@Override
	void addMeat() {
		System.out.println("----- Non veggie pizza is being prepared. -----");
		System.out.println("Adding the meat:");
		for(String meat: meatUsed) {
			System.out.println(meat + " ");
		}
	}

	@Override
	void addCheese() {
		System.out.println("Adding the cheese:");
		for(String cheese: cheeseUsed) {
			System.out.println(cheese + " ");
		}
	}

	@Override
	void addVegetables() {
		System.out.println("Adding the veggies:");
		for(String veggies: veggiesUsed) {
			System.out.println(veggies + " ");
		}
	}

	@Override
	void addCondiments() {
		System.out.println("Adding the condiment:");
		for(String condiment: condimentUsed) {
			System.out.println(condiment + " ");
		}
	}

}
