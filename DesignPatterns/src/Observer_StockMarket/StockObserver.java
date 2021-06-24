package Observer_StockMarket;

public class StockObserver implements IObserver{

	private double microsoftPrice;
	private double applePrice;
	private double googlePrice;
	
	private static int observerIDTrack = 0;
	private int observerID;
	
	private ISubject stockMarket;
	
	
	public StockObserver(ISubject stockMarket) {  // Constructor
		this.stockMarket = stockMarket;
		this.observerID = ++observerIDTrack;
		System.out.println("\nNew Observer " + this.observerID);
		System.out.println("------------------------");
		stockMarket.register(this);
	}



	@Override
	public void update(double microsoftPrice, double applePrice, double googlePrice) {
		this.microsoftPrice = microsoftPrice;
		this.applePrice = applePrice;
		this.googlePrice = googlePrice;
		
		printThePrice();
	}

	public void printThePrice() {
		System.out.println(observerID + "\nMicrosoft: " + microsoftPrice+ "\nApple: "+applePrice + "\nGoogle: "+googlePrice);
	}
}
