package State_Hotel;

public class NormalRoom implements IRoom{

	@Override
	public void cost() {
		System.out.println("Cost: 100 $");
	}

	@Override
	public void roomView() {
		System.out.println("Room View: No");
	}

	@Override
	public void breakfast() {
		System.out.println("Breakfast: Without Breakfast");
	}

	@Override
	public void airconditioning() {
		System.out.println("Without Air conditioning");
	}

	@Override
	public void wifi() {
		System.out.println("No Wifi Access");
	}

	@Override
	public void roomService() {
		System.out.println("No Room Service");
	}

	@Override
	public void TV() {
		System.out.println("no TV");
	}

	@Override
	public void balcony() {
		System.out.println("No Balcony");
	}

}

