package Facade_PhoneShop;

public class PhoneModels {

	private IIphoneShop iphone7;
	private IIphoneShop iphone8;
	private IIphoneShop iphoneX;
	private IIphoneShop iphone11;
	private IIphoneShop iphone12;
	
	public PhoneModels() {
		iphone7 = new Iphone7();
		iphone8 = new Iphone8();
		iphoneX = new IphoneX();
		iphone11 = new Iphone11();
		iphone12 = new Iphone12();
	}
	
	public void Iphone7Features() {
		System.out.println("----- Iphone 7 -----\nFeatures:");
		iphone7.description();
		System.out.print("-> Price: ");
		iphone7.price();
	}
	
	public void Iphone8Features() {
		System.out.println("----- Iphone 8 -----\nFeatures:");
		iphone8.description();
		System.out.print("-> Price: ");
		iphone8.price();
	}
	
	public void IphoneXFeatures() {
		System.out.println("----- Iphone X -----\nFeatures:");
		iphoneX.description();
		System.out.print("-> Price: ");
		iphoneX.price();
	}
	
	public void Iphone11Features() {
		System.out.println("----- Iphone 11 -----\nFeatures:");
		iphone11.description();
		System.out.print("-> Price: ");
		iphone11.price();
	}
	
	public void Iphone12Features() {
		System.out.println("----- Iphone 12 -----\nFeatures:");
		iphone12.description();
		System.out.print("-> Price: ");
		iphone12.price();
	}
}
