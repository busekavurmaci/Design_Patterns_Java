package Factory_Bank;

public class Loan {

	public int loanAmount;
	public int accountId;
	public int CustomerId;
	
	
	public Loan(int loanAmount) {
		super();
		this.loanAmount = loanAmount;
	}
	
	public void LoanInfo(Customer customer)
	{
		System.out.println("Loan Owner: "+customer.name);
		System.out.println("The loan amount is "+loanAmount);
		System.out.println("-----");
	}
	
	
}
