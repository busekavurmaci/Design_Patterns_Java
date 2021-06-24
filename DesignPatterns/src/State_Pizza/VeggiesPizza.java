package State_Pizza;

public class VeggiesPizza extends Pizza{

	String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions","Sweet Peppers"};
	String[] condimentUsed = {"Olive Oil", "Spicy", "Masala","Back Peppers","Paprika"};
	
	@Override
	void addMeat() {
		
	}
	@Override
	void addCheese() {
		
	}
	
	@Override
	void addVegetables() {
		System.out.println("----- Veggie pizza is being prepared. -----");
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