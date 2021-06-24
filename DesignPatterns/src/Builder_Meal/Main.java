package Builder_Meal;

public class Main {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal1 = mealBuilder.preparedVegMeal1();
		System.out.println("Vegetarian meal for 1. client:");
		vegMeal1.showItems();
		System.out.println("\n Total Cost: " + vegMeal1.getCost());
		System.out.println("-------------------------------");
//--------------------------------------------------------------------------
		Meal vegMeal2 = mealBuilder.preparedVegMeal2();
		System.out.println("Vegetarian meal for 2. client:");
		vegMeal2.showItems();
		System.out.println("\n Total Cost: " + vegMeal2.getCost());
		System.out.println("-------------------------------");
//--------------------------------------------------------------------------
		Meal nonVegMeal1 = mealBuilder.preparedNonVegMeal1();
		System.out.println("Non-Vegetarian meal for 3. client:");
		nonVegMeal1.showItems();
		System.out.println("\n Total Cost: " + nonVegMeal1.getCost());
		System.out.println("-------------------------------");
//--------------------------------------------------------------------------
		Meal nonVegMeal2 = mealBuilder.preparedNonVegMeal2();
		System.out.println("Non-Vegetarian meal for 4. client:");
		nonVegMeal2.showItems();
		System.out.println("\n Total Cost: " + nonVegMeal2.getCost());
		System.out.println("-------------------------------");		
				
	}

}
