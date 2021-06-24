package Facade_PhoneShop;

import java.util.Scanner;

public class Main_Phone {

	public static void main(String[] args) {
        
		PhoneModels phone = new PhoneModels();
		
		System.out.println("Please select a Iphone model.\n1- Iphone 7\n2- Iphone 8\n3- Iphone X\n4- Iphone 11\n5- Iphone 12");
		Scanner scan = new Scanner(System.in);
		int modelNo = scan.nextInt();
		
		switch(modelNo) {
		case 1: phone.Iphone7Features();
			break;
		case 2: phone.Iphone8Features();
			break;
		case 3: phone.IphoneXFeatures();
			break;
		case 4: phone.Iphone11Features();
			break;
		case 5: phone.Iphone12Features();
			break;
		default:
			System.out.println("Please enter a valid model number (1,2,3,4 or 5)");

	}
	}
}
