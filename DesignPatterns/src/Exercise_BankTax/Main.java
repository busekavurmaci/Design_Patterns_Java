package Exercise_BankTax;

public class Main {

	public static void main(String[] args) {

		User user = new User("Buse", 22);
		user.msg();
	

	TaxCalculator calculate = getCalculator();
	calculate.calculateTax();
	
	Account acc = new Account();
	acc.deposit(500);
	acc.withdraw(100);
	System.out.println(acc.getBalance());

	MainServices mainServices = new MainServices();
	mainServices.sendEmail();
	
	drawIUControl(new TextBox());
	drawIUControl(new CheckBox());
	drawIUControl(new RadioBox());
	
	getCalculator();
	
	}
	
	public static void drawIUControl(UIControl control) {
		control.draw();
	}
	
public static TaxCalculator getCalculator() {  //Created by getCalculator error
		
		return new TaxCalculate2020();
	}
	
}
