package Observer_Bank;

public class Branch1 implements IObserver {
	
	private ISubject bank;

	public Branch1(ISubject bank) {
		this.bank = bank;
		System.out.println("Branch 1");
		bank.addSubscriber(this);
	}
	
	@Override
    public void update(String branch1, String branch2, String branch3) {
		Notification();
    }
    private void Notification() {
        System.out.println("You have a notification from Branch1.");
    }
	
}
