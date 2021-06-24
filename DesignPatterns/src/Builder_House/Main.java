package Builder_House;

public class Main {

	public static void main(String[] args) {
		IHouseBuilder oldstyleofHouse = new OldHouseBuilding();
		HouseConstructor constHouse = new HouseConstructor(oldstyleofHouse);
		House firstHouse = constHouse.getHouse();
		System.out.println("House Rooms: " + firstHouse.getHouseRoom());
		System.out.println("House Bedrooms: " + firstHouse.getHouseBedroom());
		System.out.println("House Bathrooms: " + firstHouse.getHouseBathroom());
		System.out.println("House Livingrooms: " + firstHouse.getHouseLivingroom());

	}

}
