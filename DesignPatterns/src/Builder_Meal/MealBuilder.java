package Builder_Meal;

public class MealBuilder {

	public Meal preparedVegMeal1() {
		Meal meal = new Meal();
		meal.addItem( new VegBurger());
		meal.addItem( new Coke());
		
		return meal;
	}
	
    public Meal preparedVegMeal2() {
	    Meal meal = new Meal();
	    meal.addItem( new VegBurger());
	    meal.addItem( new Pepsi());
	 
	    return meal;
	}
    
    public Meal preparedNonVegMeal1() {
		Meal meal = new Meal();
		meal.addItem( new CheeseBurger());
		meal.addItem( new Coke());
		
		return meal;
	}
    
    public Meal preparedNonVegMeal2() {
		Meal meal = new Meal();
		meal.addItem( new ChickenBurger());
		meal.addItem( new Pepsi());
		
		return meal;
	}
    
    
	
}
