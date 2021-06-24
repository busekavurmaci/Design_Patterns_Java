package Builder_House;

public class House implements IBuildHouse{

	private String houseRoom;
	private String houseBedroom;
	private String houseBathroom;
	private String houseLivingroom;
	
	
//-------------------- GETTER -----------------------------------------
	public String getHouseRoom() {
		return houseRoom;
	}

	public String getHouseBedroom() {
		return houseBedroom;
	}

	public String getHouseBathroom() {
		return houseBathroom;
	}

	public String getHouseLivingroom() {
		return houseLivingroom;
	}

//-------------------- CONSTRUCTORS -------------------
	public void setBuildHouseRoom(String room) {
		this.houseRoom = houseRoom;
	}

	@Override
	public void setBuildHouseBedroom(String bedroom) {
		this.houseBedroom = houseBedroom;
	}

	@Override
	public void setBuildHouseBathroom(String bathroom) {
		this.houseBathroom = houseBathroom;
	}

	@Override
	public void setBuildHouseLivingroom(String livingroom) {
		this.houseLivingroom = houseLivingroom;
	}

}
