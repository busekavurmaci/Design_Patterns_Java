package Exercise_BankTax;

public class User {

	public String name;

	public User(String name, int age) {  //Constructor
		this.name = name;
	}
	
	public void msg() {  //message
		System.out.println("Welcome " + name);
	}
	
	
}
