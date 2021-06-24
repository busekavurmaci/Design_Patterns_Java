package Adapter_IceCream;

public class Main_IceCream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IceCreamShop iceCreamShop = new IceCreamShop();
		
		ISorbetIceCream strawberry = new StrawberryIceCream();
		IMilkIceCream chocolate = new ChocolateIceCream();
		
		iceCreamShop.addSorbetIceCream(new StrawberryIceCream());
		iceCreamShop.addMilkIceCream(new ChocolateIceCream());
		
		//IceCreamAdapter iceCreamAdapter = new IceCreamAdapter(chocolate);
		
		System.out.println("\n--- Ice Cream List ---");
		System.out.print("Name: " );
		strawberry.getName();
		System.out.print("Type: " );
		strawberry.getType();
		System.out.print("Price: " );
		strawberry.getPrice();
		System.out.println("----------------------");
		System.out.print("Name: " );
		chocolate.getName();
		System.out.print("Type: " );
		chocolate.getType();
		System.out.print("Price: " );
		chocolate.getPrice();
	}

}
