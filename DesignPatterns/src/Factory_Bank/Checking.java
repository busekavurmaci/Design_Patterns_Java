package Factory_Bank;

public class Checking extends Account{

	public int CustomerId;
	public int AccountId;
	
	public Checking(int id, String customerName) {
		super(id, customerName);
		System.out.println("Account checked.");
	}

	

	
}
