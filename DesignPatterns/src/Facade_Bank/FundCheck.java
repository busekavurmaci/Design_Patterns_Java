package Facade_Bank;

public class FundCheck {

	private double cashInAccount = 10000.00;
	
	public double getCashInAccount() {
		return cashInAccount;
	}
	
	public void decreaseCaseAccount(double cashWithdraw) {
		cashInAccount -= cashWithdraw;
	}
	
	public void increaseCaseAccount(double cashDeposit) {
		cashInAccount += cashDeposit;
	}
	
	public boolean haveEnoughMoney(double cashToWithdrawal) {
		if (cashToWithdrawal > getCashInAccount()) {
			System.out.println("Error: You don't have enough money in your account.");
			System.out.println("Current Balance: " + getCashInAccount());
			return false;
		}
		else {
			decreaseCaseAccount(cashToWithdrawal);
			System.out.println("Withdrawal Complete: Current Balance: " + getCashInAccount());
			return true;
		}
	}
	
	public void makeDeposit(double cashToDeposit) {
		increaseCaseAccount(cashToDeposit);
		System.out.println("Deposit Complete. Current Balance: " + getCashInAccount());
	}
}
