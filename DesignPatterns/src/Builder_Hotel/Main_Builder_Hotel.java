package Builder_Hotel;

import java.util.Scanner;

public class Main_Builder_Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IRoomBuilder normalRoom = new Builder_NormalRoom();
		IRoomBuilder silverRoom = new Builder_SilverRoom();
		IRoomBuilder goldRoom = new Builder_GoldRoom();
				
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Please select a booking package number.\n1- Normal\n2- Silver\n3- Gold");
		
		int packageNo = scan.nextInt();
		
		switch(packageNo) {
		case 1:
			System.out.println("Normal Room\n-----------" );
			normalRoom.cost();
			normalRoom.roomView();
			normalRoom.breakfast(); 
			normalRoom.airconditioning(); 
			normalRoom.wifi(); 
			normalRoom.roomService(); 
			normalRoom.TV(); 
			normalRoom.balcony(); 
			break;
		case 2:
			System.out.println("Silver Room\n-----------" );
			silverRoom.cost();
			silverRoom.roomView();
			silverRoom.breakfast(); 
			silverRoom.airconditioning(); 
			silverRoom.wifi(); 
			silverRoom.roomService(); 
			silverRoom.TV(); 
			silverRoom.balcony(); 
			break;
		case 3:
			System.out.println("Gold Room\n-----------" );
			goldRoom.cost();
			goldRoom.roomView();
			goldRoom.breakfast(); 
			goldRoom.airconditioning(); 
			goldRoom.wifi(); 
			goldRoom.roomService(); 
			goldRoom.TV(); 
			goldRoom.balcony();  
			break;
		default:
			System.out.println("Please enter a valid package number (1,2 or 3)");
	}
	}

}
