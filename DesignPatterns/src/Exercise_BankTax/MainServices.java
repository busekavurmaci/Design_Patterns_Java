package Exercise_BankTax;

public class MainServices {

	public void sendEmail() {
		connect();
		authenticate();
		disconnect();
	}
	
	private void connect() {
		System.out.println("Connected");
	}
	private void authenticate() {
		System.out.println("Authenticated");
	}
	
	private void disconnect() {
		System.out.println("Disconnected");
	}
	
	
}
