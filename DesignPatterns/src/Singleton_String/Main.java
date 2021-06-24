package Singleton_String;

class Singleton{
	
	//Static variable single_instance from Singleton class.
	private static Singleton single_instance = null;
	public String s;
	
	private Singleton() {
		s= "Welcome to Singleton Pattern.";
	}
	
	//Static method to create instance of Singleton class.
	public static Singleton Singleton() {
		if (single_instance == null) 
		{
			single_instance = new Singleton();
		}
		return single_instance;
	}
	
}
//--------------------- MAIN ---------------------------
public class Main {

	public static void main(String[] args) {
		
		Singleton x = Singleton.Singleton();
		Singleton y = Singleton.Singleton();
		Singleton z = Singleton.Singleton();
		
		x.s = (x.s).toUpperCase();
		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		System.out.println("\n");
		
		z.s = (z.s).toLowerCase(); 
		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);

	}

}
