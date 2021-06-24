package State_Hotel;

public class Room {

	private IRoom normalRoom;
	private IRoom silverRoom;
	private IRoom goldRoom;
	
	public Room() {
		normalRoom = new NormalRoom();
		silverRoom = new SilverRoom();
		goldRoom = new GoldRoom();
	}
	//-------- NORMAL ROOM --------
	public void normalCost() {
		normalRoom.cost();
	}
	public void normalRoomView() {
		normalRoom.roomView();
	}
	public void normalBreakfast() {
		normalRoom.breakfast();
	}
	public void normalAirconditioning() {
		normalRoom.airconditioning();
	}
	public void normalWifi() {
		normalRoom.wifi();
	}
	public void normalRoomService() {
		normalRoom.roomService();
	}
	public void normalTV() {
		normalRoom.TV();
	}
	public void normalBalcony() {
		normalRoom.balcony();
	}
	//-------- SILVER ROOM --------
	public void silverCost() {
		silverRoom.cost();
	}
	public void silverRoomView() {
		silverRoom.roomView();
	}
	public void silverBreakfast() {
		silverRoom.breakfast();
	}
	public void silverAirconditioning() {
		silverRoom.airconditioning();
	}
	public void silverWifi() {
		silverRoom.wifi();
	}
	public void silverRoomService() {
		silverRoom.roomService();
	}
	public void silverTV() {
		silverRoom.TV();
	}
	public void silverBalcony() {
		silverRoom.balcony();
	}
	//-------- GOLD ROOM --------
	public void goldCost() {
		goldRoom.cost();
	}
	public void goldRoomView() {
		goldRoom.roomView();
	}
	public void goldBreakfast() {
		goldRoom.breakfast();
	}
	public void goldAirconditioning() {
		goldRoom.airconditioning();
	}
	public void goldWifi() {
		goldRoom.wifi();
	}
	public void goldRoomService() {
		goldRoom.roomService();
	}
	public void goldTV() {
		goldRoom.TV();
	}
	public void goldBalcony() {
		goldRoom.balcony();
	}
}
