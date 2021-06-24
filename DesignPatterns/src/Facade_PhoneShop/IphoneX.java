package Facade_PhoneShop;

public class IphoneX implements IIphoneShop{

	@Override
	public void description() {
		System.out.println("Screen Size: 5.8 inch\n"
				+ "Front Camera: 7 MP\n"
				+ "Rear Camera: 12 MP\n"
				+ "Internal Memory: 64 GB\n"
				+ "RAM: 3 GB\n"
				+ "Number of Processors: 6 Core");
		
	}

	@Override
	public void price() {
		System.out.println("9.999 TL");
		
	}

}
