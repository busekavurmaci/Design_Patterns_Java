package Flyweight_Circle;

import java.util.HashMap;

public class ShapeFactory {
	private static final HashMap circleMap = new HashMap();
	
	public static IShape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);
		
		if(circle == null) {
			circle = new Circle(color);
			circleMap.put(circle, circle);
			System.out.println("Creating circle color: " + color);
		}
		return circle;
	}

}
