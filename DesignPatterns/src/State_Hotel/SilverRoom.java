package State_Hotel;

public class SilverRoom implements IRoom{

	@Override
	public void cost() {
		System.out.println("Cost: 300 $");
	}

	@Override
	public void roomView() {
		System.out.println("Room View: Forest");
	}

	@Override
	public void breakfast() {
		System.out.println("Breakfast: With Breakfast");
	}

	@Override
	public void airconditioning() {
		System.out.println("Air-conditioned");
	}

	@Override
	public void wifi() {
		System.out.println("Wifi Access: 2 device");
	}

	@Override
	public void roomService() {
		System.out.println("Room Service: 24/7");
	}

	@Override
	public void TV() {
		System.out.println("24-inch TV");
	}

	@Override
	public void balcony() {
		System.out.println("No Balcony");
	}

}
