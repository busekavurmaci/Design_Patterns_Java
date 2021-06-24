package Observer_StockMarket;

import java.text.DecimalFormat;

public class GetStockMarket implements Runnable{

	private int startTime;
	private String stock;
	private double price;
	
	private ISubject stockMarket;

	
	
	public GetStockMarket(ISubject newStockMarket, int newStartTime, String newStock, double newPrice) {
		this.startTime = newStartTime;
		this.stock = newStock;
		this.price = newPrice;
		this.stockMarket = newStockMarket;
	}

	@Override
	public void run() {
		
		for(int i=1; i<=10; i++)
		{
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {}
			
			double randNum = (Math.random() * (0.05) ) - 0.02;
			DecimalFormat df = new DecimalFormat("#.##");
			price = Double.valueOf(df.format(price + randNum));
			
			if(stock == "Microsoft") 
			{
				((StockMarket)stockMarket).setMicrosoftPrice(price);
			}
			
			if(stock == "Apple") 
			{
				((StockMarket)stockMarket).setApplePrice(price);
			}
			
			if(stock == "Google") 
			{
				((StockMarket)stockMarket).setGooglePrice(price);
			}
			
			System.out.println(stock + ": "+ df.format(price + randNum) + " "+ df.format(randNum) );
			System.out.println();
				
        }
	}
	
	
}
