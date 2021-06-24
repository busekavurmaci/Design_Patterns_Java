package State_Hotel;

import java.util.Scanner;

public class Main_Hotel {

	public static void main(String[] args) {

		Room room = new Room();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please select a booking package number.\n1- Normal\n2- Silver\n3- Gold");
		
		int packageNo = scan.nextInt();
		
		switch(packageNo) {
		case 1:
			System.out.println("Normal Room\n-----------" );
			room.normalCost();
			room.normalRoomView();
			room.normalBreakfast(); 
			room.normalAirconditioning(); 
			room.normalWifi(); 
			room.normalRoomService(); 
			room.normalTV(); 
			room.normalBalcony(); 
			break;
		case 2:
			System.out.println("Silver Room\n-----------" );
			room.silverCost();
			room.silverRoomView();
			room.silverBreakfast(); 
			room.silverAirconditioning(); 
			room.silverWifi(); 
			room.silverRoomService(); 
			room.silverTV(); 
			room.silverBalcony(); 
			break;
		case 3:
			System.out.println("Gold Room\n-----------" );
			room.goldCost();
			room.goldRoomView();
			room.goldBreakfast(); 
			room.goldAirconditioning(); 
			room.goldWifi(); 
			room.goldRoomService(); 
			room.goldTV(); 
			room.goldBalcony(); 
			break;
		default:
			System.out.println("Please enter a valid package number (1,2 or 3)");
	}
}
}
