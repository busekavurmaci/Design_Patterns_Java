package Prototype_Shape;

import java.util.Hashtable;

public class ShapeCache {
	
	private static Hashtable<String, Shape> shapeHashMap = new Hashtable<String, Shape>();
	public static Shape getShape(String shapeId) {
		
		Shape chachedShape = shapeHashMap.get(shapeId);
		return (Shape) chachedShape.clone();
	}

	public static void loadCache() {
		
		Circle circle = new Circle();
		circle.setId("1");
		shapeHashMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeHashMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeHashMap.put(rectangle.getId(), rectangle);
	}
}
