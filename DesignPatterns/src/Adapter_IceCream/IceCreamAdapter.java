package Adapter_IceCream;

public class IceCreamAdapter implements ISorbetIceCream{

	IMilkIceCream milkIceCream;
	
	public IceCreamAdapter(IMilkIceCream milkIceCream){
        this.milkIceCream = milkIceCream;
    }

	@Override
	public void getName() {
		milkIceCream.getName();
	}

	@Override
	public void getType() {
		milkIceCream.getType();
		
	}
	
	@Override
	public void getPrice() {
		milkIceCream.getPrice();
	}

	
}
