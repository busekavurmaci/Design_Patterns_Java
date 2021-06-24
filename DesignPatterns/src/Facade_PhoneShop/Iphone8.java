package Facade_PhoneShop;

public class Iphone8 implements IIphoneShop{

	@Override
	public void description() {
		System.out.println("Screen Size: 4.7 inch\n"
				+ "Front Camera: 7 MP\n"
				+ "Rear Camera: 12 MP\n"
				+ "Internal Memory: 128 GB\n"
				+ "RAM: 2 GB\n"
				+ "Number of Processors: 6 Core");
		
	}

	@Override
	public void price() {
		System.out.println("5.699 TL");
		
	}

}
