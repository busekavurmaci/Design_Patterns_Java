package Flyweight_Number;

public class Gazillion2 {
	private int row;
	public Gazillion2(int theRow) {
		row = theRow;
		System.out.println("Actual actor: " +row);
	}
	
	void report(int thecol) {
		System.out.println(" "+ row + thecol);
	}

}
