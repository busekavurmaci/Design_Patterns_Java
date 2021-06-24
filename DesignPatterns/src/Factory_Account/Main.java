package Factory_Account;

public class Main {

	public static void main(String[] args) {

		Account acc1 = FactoryAccount.getInstance(1);
		System.out.println(acc1.getType());
		System.out.println(acc1.getCurrency());
		
		Account acc2 = FactoryAccount.getInstance(2);
		System.out.println(acc2.getType());
		System.out.println(acc2.getCurrency());
		
		Account acc3 = FactoryAccount.getInstance(3);
		System.out.println(acc3.getType());
		System.out.println(acc3.getCurrency());
	}

}
