package Observer_StockMarket;

import java.util.ArrayList;

public class StockMarket implements ISubject{

	private ArrayList<IObserver> observers;
	
	private double microsoftPrice;
	private double applePrice;
	private double googlePrice;
	
	public StockMarket() {
		observers = new ArrayList<IObserver>();
	}
	
	@Override
	public void register(IObserver newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void unregister(IObserver deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println("\n** Observer "+(observerIndex + 1)+ " deleted. **\n");
		
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		
		for(IObserver observer: observers)
		{
			observer.update(microsoftPrice, applePrice, googlePrice);
		}
	}

	// Setter Methods
	public void setMicrosoftPrice(double microsoftPrice) {
		this.microsoftPrice = microsoftPrice;
		notifyObserver();
	}

	public void setApplePrice(double applePrice) {
		this.applePrice = applePrice;
		notifyObserver();
	}

	public void setGooglePrice(double googlePrice) {
		this.googlePrice = googlePrice;
		notifyObserver();
	}
	
	

}
