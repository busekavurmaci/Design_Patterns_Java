package Decorator_Coffee;

import java.util.Scanner;

public class Main_Coffee {

	public static void main(String[] args) {
		
		Beverage espresso = new Espresso();
		Beverage cappuccino = new Cappuccino();
		Beverage americano = new Americano();
		Beverage latte = new Latte();
		
		//System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Starbucks!");
		System.out.println("Enter the number of the coffee of your choice, please.");
		System.out.println("1- Espresso \n2- Cappuccino \n3- Americano \n4- Latte");
		
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Your "+espresso.getDescription() +" is being prepared. Price: " +"$" + espresso.cost());
		break;
		case 2: System.out.println("Your "+cappuccino.getDescription() +" is being prepared. Price: " + "$" + cappuccino.cost());
		break;
		case 3: System.out.println("Your "+americano.getDescription() +" is being prepared. Price: " + "$" + americano.cost());
		break;
		case 4: System.out.println("Your "+latte.getDescription() +" is being prepared. Price: " + "$" + latte.cost());
		break;
		default:
		    System.out.println("Please enter a valid coffee number");
		}
	}

}
