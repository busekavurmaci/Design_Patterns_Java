package Flyweight_Number;

public class Gazillion1 {

	private static int num=0;
	private int row, col;
	
	public Gazillion1(int maxPerRow) {
		row = num / maxPerRow;
		col = num % maxPerRow;
		num++;
	}
	
	void report() {
		System.out.println(" " + row + col);
	}
}
