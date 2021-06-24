package Adapter_IceCream;

import java.util.ArrayList;
import java.util.List;

public class IceCreamShop {

	    List<IMilkIceCream> milkIceCream;
	    List<ISorbetIceCream> sorbetIceCream;

	    public IceCreamShop() {
	        this.milkIceCream = new ArrayList<>();
	        this.sorbetIceCream = new ArrayList<>();
	    }

	    public void addMilkIceCream(IMilkIceCream milkIceCream) {
	        this.milkIceCream.add(milkIceCream);
	        System.out.println("A milk ice cream was added.");
	    }
	    
	    public void removeMilkIceCream(IMilkIceCream milkIceCream) {
	        this.milkIceCream.remove(milkIceCream);
	        System.out.println("A milk ice cream was deleted.");
	    }
	    
	    public void addSorbetIceCream(ISorbetIceCream sorbetIceCream) {
	        this.sorbetIceCream.add(sorbetIceCream);
	        System.out.println("A sorbet ice cream was added.");
	    }
	    
	    public void removeSorbetIceCream(ISorbetIceCream sorbetIceCream) {
	        this.sorbetIceCream.remove(sorbetIceCream);
	        System.out.println("A sorbet ice cream was deleted.");
	    }
}

