package Decorator_Sandwich;

public class Main {

	public static void main(String[] args) {
		
		ISandwich veggie = new VeggieSandwich(new BasicSandwich());
		ISandwich chicken = new ChickenSandwich(new BasicSandwich());
		
		
        System.out.println(veggie.description()  +  ": $"  +  veggie.cost());
        System.out.println(chicken.description()  +  ": $"  +  chicken.cost());
        
	}
}
