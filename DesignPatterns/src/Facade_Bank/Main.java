package Facade_Bank;

public class Main {

	public static void main(String[] args) {
		
		BankAccountFacade accountBank = new BankAccountFacade(1234567,1234);
		accountBank.withdrawCash(500.00);
		accountBank.withdrawCash(200.00);
		accountBank.deposit(800.00);

	}

}
