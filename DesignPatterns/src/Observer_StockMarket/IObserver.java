package Observer_StockMarket;

public interface IObserver {

	public void update(double microsoftPrice, double applePrice, double googlePrice);
	
}
