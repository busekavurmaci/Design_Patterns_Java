package Factory_Pizza;

import java.util.Random;
import java.util.Scanner;

public class Pizza_Main {

	public static void main(String[] args) {
		
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Welcome to Pizza Store!");
		System.out.println("1- Banana Pizza \n2- Chicken Pizza \n3- Pineapple Pizza \n4- Beef Pizza \n");
		System.out.println("Please order pizza by entering a pizza number (1,2,3 or 4):");
		int typeNo = scan.nextInt();
		
		Random random = new Random();
		int orderId = random.nextInt(10)+1;
		
		Client client = new Client(orderId);
		
		switch(typeNo) {
		case 1:
			System.out.println("Your Order Id: "+orderId);
			System.out.println("Enter your order number to see the status of your order.");
			int enteredOrderId = scan.nextInt();
			if(enteredOrderId == orderId)
			{
				Pizza pizza = store.orderPizza("banana");
			}
			else
			{
				System.out.println("There is no such order. Please enter your order number correctly.");
			}

			break;
		case 2:
			System.out.println("Your Order Id: "+orderId);
			System.out.println("Enter your order number to see the status of your order.");
			int enteredOrderId2 = scan.nextInt();
			if(enteredOrderId2 == orderId)
			{
				Pizza pizza = store.orderPizza("chicken");
			}
			else
			{
				System.out.println("There is no such order. Please enter your order number correctly.");
			}
			
			break;
		case 3:
			System.out.println("Your Order Id: "+orderId);
			System.out.println("Enter your order number to see the status of your order.");
			int enteredOrderId3 = scan.nextInt();
			if(enteredOrderId3 == orderId)
			{
				Pizza pizza = store.orderPizza("pineapple");
			}
			else
			{
				System.out.println("There is no such order. Please enter your order number correctly.");
			}

			break;
		case 4:
			System.out.println("Your Order Id: "+orderId);
			System.out.println("Enter your order number to see the status of your order.");
			int enteredOrderId4 = scan.nextInt();
			if(enteredOrderId4 == orderId)
			{
				Pizza pizza = store.orderPizza("beef");
			}
			else
			{
				System.out.println("There is no such order. Please enter your order number correctly.");
			}

			break;
			
		default:
		    System.out.println("Please enter a valid pizza type number");
		}
		//----------------------------------------------------
		
	}

}
