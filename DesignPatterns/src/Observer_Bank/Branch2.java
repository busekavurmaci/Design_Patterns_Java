package Observer_Bank;

public class Branch2 implements IObserver{
	
	private ISubject bank;

	public Branch2(ISubject bank) {
		this.bank = bank;
		System.out.println("Branch 2");
		bank.addSubscriber(this);
	}
	
	@Override
	public void update(String branch1, String branch2, String branch3) {
		Notification();
    }
    private void Notification() {
        System.out.println("You have a notification from Branch2.");
    }
	

}
