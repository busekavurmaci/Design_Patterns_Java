package Factory_Aircraft;

public class FactoryEnemyAircraft {

	public Aircraft makeEnemyAircraft(String newAircraftType) {
		Aircraft newAircraft = null;
		
		if(newAircraftType.equals("A")) 
		{
			return new RocketEnemyAircraft();
		}
		else 
		{
			if(newAircraftType.equals("B")) 
			{
				return new BombEnemyAircraft();
			}
			else
			{
				if(newAircraftType.equals("C")) 
				{
					return new SecondBombEnemyAircraft();
				}
				else return null;
			}
		}
	}
}
