package Adapter_IceCream;

public class StrawberryIceCream implements ISorbetIceCream{

	@Override
	public void getName() {
		System.out.println("Strawberry Ice Cream");
	}

	@Override
	public void getType() {
		System.out.println("Sorbet Ice Cream");
		
	}
	
	@Override
	public void getPrice() {
		System.out.println("5 TL");
	}

}
