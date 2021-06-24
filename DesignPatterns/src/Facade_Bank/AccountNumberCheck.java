package Facade_Bank;

public class AccountNumberCheck {

	private int accountNumber = 1234567;
	public int getAccountNumber() {
		return accountNumber;
	}
	public boolean accountActive(int accountNumToCheck) {
		if(accountNumToCheck == getAccountNumber()) 
		{
			return true;
		}
		else{
			return false;
		}
			
	}
	
}
