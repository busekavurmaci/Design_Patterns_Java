package Facade_PhoneShop;

public class Iphone12 implements IIphoneShop{

	@Override
	public void description() {
		System.out.println("Screen Size: 6.1 inch\n"
				+ "Front Camera: 12 MP\n"
				+ "Rear Camera: 12 MP\n"
				+ "Internal Memory: 64 GB\n"
				+ "RAM: 4 GB\n"
				+ "Number of Processors: 6 Core");
		
	}

	@Override
	public void price() {
		System.out.println("10.999 TL");
		
	}

}
