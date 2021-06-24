package State_Pizza;

public class Main {

	public static void main(String[] args) {
		Pizza firstPizzaOrder = new NonVeggiePizza();
		firstPizzaOrder.makePizza();
		
		Pizza secondPizzaOrder = new VeggiesPizza();
		secondPizzaOrder.makePizza();
	}

}
