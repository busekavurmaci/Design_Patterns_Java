package Factory_Bank;

public class Bank {

	public int bankId;
	public String name;
    public String location;
    
    public Bank(int bankId, String name, String location) {
		super();
		this.bankId = bankId;
		this.name = name;
		this.location = location;
		
		System.out.println("Bank Information");
		System.out.println("Bank id: "+ bankId+" Name: "+ name + " Location: "+ location);
		System.out.println("-----");
	}
	
    public void displayCustomers(Customer customer) {
    	System.out.println("Customers in the bank: "+customer.name);
    }
	}

