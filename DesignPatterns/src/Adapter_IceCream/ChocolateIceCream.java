package Adapter_IceCream;

public class ChocolateIceCream implements IMilkIceCream{

	@Override
	public void getName() {
		System.out.println("Chocolate Ice Cream");
	}

	@Override
	public void getType() {
		System.out.println("Milk Ice Cream");
		
	}
	
	@Override
	public void getPrice() {
		System.out.println("8 TL");
	}

	

}
