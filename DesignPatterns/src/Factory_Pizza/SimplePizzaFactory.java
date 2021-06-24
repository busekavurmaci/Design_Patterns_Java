package Factory_Pizza;

public class SimplePizzaFactory {

	public Pizza createPizza (String type) {
	Pizza pizza = null;
	
	if (type.equals ("banana"))
	{
	pizza = new BananaPizza();
	} 
	else if (type.equals ("chicken"))
	{
	pizza = new ChickenPizza();
	} 
	else if (type.equals ("pineapple"))
	{
	pizza = new PineapplePizza();
	} 
    else if (type.equals ("beef"))
    {
	pizza = new BeefPizza();
	}
    

	return pizza;
	}
	
}
