package Facade_Shape;


public class ShapeMaker {

	private IShape circle;
	private IShape rectangle;
	private IShape square;
	
	public ShapeMaker() {
			circle = new Circle();
			square = new Square();
			rectangle = new Rectangle();
		}
	
	public void drawCircle() {
		circle.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
	public void drawSquare() {
		square.draw();
	}
	
}

