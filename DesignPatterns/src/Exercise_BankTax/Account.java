package Exercise_BankTax;

public class Account {

	//attribute
	public float balance;
	
	public float getBalance() {  //Getter function
		return balance;
	}
	
	public void deposit(float amount) {
		
		if(amount>0) {
			this.balance += amount;
		}
	}
	
	public void withdraw(float amount) {
		
		if(amount>0) {
			this.balance -= amount;
		}
	}

	
	
}
