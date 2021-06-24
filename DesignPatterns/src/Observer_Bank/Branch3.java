package Observer_Bank;

public class Branch3 implements IObserver{
	
	private ISubject bank;

	public Branch3(ISubject bank) {
		this.bank = bank;
		System.out.println("Branch 3");
		bank.addSubscriber(this);
	}
	
	@Override
	public void update(String branch1, String branch2, String branch3) {
		Notification();
    }
    private void Notification() {
        System.out.println("You have a notification from Branch3.");
    }
	

}
