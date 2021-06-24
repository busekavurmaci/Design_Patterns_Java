package Builder_Hotel;

public class Hotel implements IBuildHotel{
	
	private String hotelNormalRoom;
	private String hotelSilverRoom;
	private String hotelGoldRoom;

	//-------------------- GETTER -------------------
	public String getHotelNormalRoom() {
		return hotelNormalRoom;
	}

	public String getHotelSilverRoom() {
		return hotelSilverRoom;
	}

	public String getHotelGoldRoom() {
		return hotelGoldRoom;
	}


	//-------------------- CONSTRUCTORS -------------------
	@Override
	public void setBuildNormalRoom(String normalRoom) {
		this.hotelNormalRoom = hotelNormalRoom;
		
	}

	@Override
	public void setBuildSilverRoom(String silverRoom) {
		this.hotelSilverRoom = hotelSilverRoom;
		
	}

	@Override
	public void setBuildGoldRoom(String goldRoom) {
		this.hotelGoldRoom = hotelGoldRoom;
		
	}

	
}
