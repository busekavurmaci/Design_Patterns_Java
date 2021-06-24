package Factory_Bank;

public class Saving extends Account{

	public int CustomerId;
	public int AccountId;
	
	public Saving(int id, String customerName) {
		super(id, customerName);
		System.out.println("Account saved.");
	}

	
	
	
}
