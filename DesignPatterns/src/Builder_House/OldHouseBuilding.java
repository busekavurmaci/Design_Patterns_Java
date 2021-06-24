package Builder_House;

public class OldHouseBuilding implements IHouseBuilder{

	private House house;
	
	
	public OldHouseBuilding() {  //Constructor
		this.house = new House();
	}

	@Override
	public void buildHouseRoom() {
		house.setBuildHouseRoom("Build Rooms");
	}

	@Override
	public void BuildHouseBedroom() {
		house.setBuildHouseBedroom("Build Bedrooms");
	}

	@Override
	public void BuildHouseBathroom() {
		house.setBuildHouseBathroom("Build Bathrooms");
	}

	@Override
	public void BuildHouseLivingroom() {
		house.setBuildHouseLivingroom("Build Livingrooms");
	}

	@Override
	public House gethouse() {
		return this.house;
	}

}
