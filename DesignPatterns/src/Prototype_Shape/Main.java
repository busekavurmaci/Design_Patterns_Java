package Prototype_Shape;

public class Main {

	public static void main(String[] args) {
		
		ShapeCache.loadCache();
		
		Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
		System.out.println(clonedShape1.getId() + ". Shape: " + clonedShape1.getType());
		
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println(clonedShape2.getId() + ". Shape: " + clonedShape2.getType());
		
		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println(clonedShape3.getId() + ". Shape: " + clonedShape3.getType());

	}
}
