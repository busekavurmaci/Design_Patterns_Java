package Factory_Bank;

public class Account {
	
	//attribute
		public float balance;
		public String customerName;
		public int Id;
		
		
	    public Account(int id, String customerName) {
			Id = id;
			this.customerName = customerName;
		}
	    
	    public void getAccount()	
	    {
	        System.out.println(Id+". customer name: "+customerName);
	    }
		
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
