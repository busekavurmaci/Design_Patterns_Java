package Observer_StockMarket;

public class Main {

	public static void main(String[] args) {
		
		StockMarket stockMarket = new StockMarket();
		
		StockObserver stockObserver1 = new StockObserver(stockMarket);
		stockMarket.setMicrosoftPrice(300.9);
		stockMarket.setApplePrice(420.3);
		stockMarket.setGooglePrice(530.76);
		
		StockObserver stockObserver2 = new StockObserver(stockMarket);
		stockMarket.setMicrosoftPrice(390.5);
		stockMarket.setApplePrice(920.4);
		stockMarket.setGooglePrice(830.72);

		stockMarket.unregister(stockObserver2);
		stockMarket.setMicrosoftPrice(700.9);
		stockMarket.setApplePrice(2020.3);
		stockMarket.setGooglePrice(1870.76);
		

		Runnable getMicrosoft = new GetStockMarket(stockMarket, 2, "Microsoft", 120.9);
		Runnable getApple = new GetStockMarket(stockMarket, 2, "Apple", 120.9);
		Runnable getGoogle = new GetStockMarket(stockMarket, 2, "Google",120.9);
		
		new Thread(getMicrosoft).start();
		new Thread(getApple).start();
		new Thread(getGoogle).start();
		
	}

}
