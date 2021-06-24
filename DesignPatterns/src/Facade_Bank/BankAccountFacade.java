package Facade_Bank;

public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;
	
	AccountNumberCheck accChecker;
	SecurityCodeCheck secCodeCheck;
	FundCheck fundCheck;
	WelcomeToHSBC hsbcBank;
	
	public BankAccountFacade(int newAccountNumber, int newSecurityCode) {
		this.accountNumber = newAccountNumber;
		this.securityCode = newSecurityCode;
		
		hsbcBank = new WelcomeToHSBC();
		accChecker = new AccountNumberCheck();
		secCodeCheck = new SecurityCodeCheck();
		fundCheck = new FundCheck();
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public int getSecurityCode() {
		return securityCode;
	}
	
	public void withdrawCash(double cashToGet) {
		if(accChecker.accountActive(getAccountNumber()) && secCodeCheck.isCodeCorrect(getSecurityCode()) && fundCheck.haveEnoughMoney(cashToGet)){
			System.out.println("Transaction is completed. \n");
		}
		else {
			System.out.println("Transaction is failed.\n");
		}
	}
	
	public void deposit(double cashToDeposit) {
		if(accChecker.accountActive(getAccountNumber()) && secCodeCheck.isCodeCorrect(getSecurityCode())) {
			fundCheck.makeDeposit(cashToDeposit);
			System.out.println("Transaction is completed. \n");
		}
		else {
			System.out.println("Transaction is failed.\n");
		}
	}
}
