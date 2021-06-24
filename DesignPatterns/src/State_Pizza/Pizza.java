package State_Pizza;

public abstract class Pizza {
	
	boolean afterFirstCondiment = false;
	
	final void makePizza() {
		cutBun();
		
		if(customerWantMeat()) {
			addMeat();
			afterFirstCondiment = true;
			}
		//--------------------------------
		if(customerWantCheese()) {
			if(afterFirstCondiment) {
				System.out.println("\n");
				addCheese();
				afterFirstCondiment = true;
			}
			}
		//--------------------------------
		if(customerWantVegetables()) {
			if(afterFirstCondiment) {
				System.out.println("\n");
				addVegetables();
				afterFirstCondiment = true;
			}
			}
		//--------------------------------
		if(customerWantCondiments()) {
			if(afterFirstCondiment) {
				System.out.println("\n");
				addCondiments();
				afterFirstCondiment = true;
			}
			}
		//--------------------------------
		cookThePizza();
	}
	
	public void cutBun() {
		System.out.println("The pizza is cutting");
	}
	
	abstract void addMeat();
	abstract void addCheese();
	abstract void addVegetables();
	abstract void addCondiments();
	
	boolean customerWantMeat() {return true;}
	boolean customerWantCheese() {return true;}
	boolean customerWantVegetables() {return true;}
	boolean customerWantCondiments() {return true;}
	
	public void cookThePizza() {
		System.out.println("Start cook the Pizza");
	}
}
