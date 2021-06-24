package Builder_Meal;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<IItem> items = new ArrayList<>();
	
	public void addItem(IItem item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		
		for(IItem item : items) {
			cost+= item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for(IItem item: items) {
			System.out.print("\n Item: " + item.name());
			System.out.print(", Packing: " + item.packing().pack());
			System.out.print(", Price: " + item.price());
		}
	}
	
}