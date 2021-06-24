package Builder_Hotel;

public class Builder_SilverRoom implements IRoomBuilder{

	@Override
	public void cost() {
		System.out.println("Cost: 500 $");
	}

	@Override
	public void roomView() {
		System.out.println("Room View: Sea");
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
		System.out.println("Wifi Access: unlimited");
	}

	@Override
	public void roomService() {
		System.out.println("Room Service: 24/7");
	}

	@Override
	public void TV() {
		System.out.println("55-inch, 4K TV");
	}

	@Override
	public void balcony() {
		System.out.println("Balcony: yes");
	}

}
