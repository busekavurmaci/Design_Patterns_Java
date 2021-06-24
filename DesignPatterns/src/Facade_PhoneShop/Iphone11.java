package Facade_PhoneShop;

public class Iphone11 implements IIphoneShop{

	@Override
	public void description() {
		System.out.println("Screen Size: 6.1 inch\n"
				+ "Front Camera: 12 MP\n"
				+ "Rear Camera: 12 MP + 12 MP\n"
				+ "Internal Memory: 128 GB\n"
				+ "RAM: 4 GB\n"
				+ "Number of Processors: 6 Core");
		
	}

	@Override
	public void price() {
		System.out.println("8.099 TL");
		
	}

}
