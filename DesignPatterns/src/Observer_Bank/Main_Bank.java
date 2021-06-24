package Observer_Bank;

public class Main_Bank {

	public static void main(String[] args) {
		
		Bank bank = new Bank();

		Branch1 branch1 = new Branch1(bank);
		Branch2 branch2 = new Branch2(bank);
		Branch3 branch3 = new Branch3(bank);
		
		
		bank.notifySubscribers();
		
	}

}
