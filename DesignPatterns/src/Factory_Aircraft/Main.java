package Factory_Aircraft;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		FactoryEnemyAircraft aircraftFactory = new FactoryEnemyAircraft();
		Aircraft theEnemy = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What type of weapon Aircraft used? (A / B/ C)");
		
		if(scan.hasNextLine()) 
		{
			String typeofAircraft = scan.nextLine();
			theEnemy = aircraftFactory.makeEnemyAircraft(typeofAircraft);
		}
		
		if(theEnemy != null)
		{
			stuffEnemy(theEnemy);
		}
		else 
		{
			System.out.println("Enter a A, B or C for next time.");
		}
		
	}

	private static void stuffEnemy(Aircraft enemyAircraft) {
		enemyAircraft.displayEnemy();
		enemyAircraft.followAircraft();
		enemyAircraft.enemyShoot();
	}

}
