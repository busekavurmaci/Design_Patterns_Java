package Flyweight_Number;

public class Flyweight_Main {
	public static final int ROWS = 6, COLS = 10;
	
	 public static void main(String[] args) {
		 
		 FlyweightFactory theFactory = new FlyweightFactory(ROWS);
		 for(int i=0; i<ROWS; i++) {
			 for(int j=0; j<COLS; j++) {
				 theFactory.getFlyweight(i).report(j);
				 System.out.println();
			 }
		 }
	 }
	 
}
