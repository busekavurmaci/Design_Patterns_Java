package Factory_Account;

public class FactoryAccount {

	public static Account getInstance(int account) {
		Account acc = null;
		
		switch(account) {
		case 1: 
			acc = new MasterCard();
			break;
		case 2: 
			acc = new VisaCard();
			break;
		case 3: 
			acc = new MaestroCard();
			break;
		default:
			break;
				
		}
		
		return acc;
	}
	
	
	
	
}
