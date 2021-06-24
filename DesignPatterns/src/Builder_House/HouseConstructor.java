package Builder_House;

public class HouseConstructor {
	
	private IHouseBuilder houseBuilder;
	
	HouseConstructor (IHouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	public House getHouse() {
		return this.houseBuilder.gethouse();
	}
	

}
