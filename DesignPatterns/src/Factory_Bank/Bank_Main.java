package Factory_Bank;

import java.util.Scanner;

import Exercise_BankTax.Account;

public class Bank_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank(352, "StarBank", "Istanbul");
		Customer customer = new Customer(1, "Buse", "Istanbul", 123456789, 111);
		

		
		Account acc = new Account();
		acc.deposit(500);
		acc.withdraw(100);
		System.out.println("Balance: "+acc.getBalance());
		
		Checking check = new Checking(1, "Buse");
		Saving save = new Saving(1, "Buse");
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("---Loan---");
		System.out.println("Enter the loan amount: ");
		
		int x=scan.nextInt();
		
		Loan loan = new Loan(x);
		
		loan.LoanInfo(customer);
	}
	

}
