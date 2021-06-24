package Factory_Aircraft;

public abstract class Aircraft {

	//attributes
	private String name;
	private double damage;
	
	//Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	//Methods
	public void followAircraft() {
		System.out.println(getName() + "this is follow which faster aircraft.");
	}
	
	public void displayEnemy() {
		System.out.println(getName() + "the aircraft is currently on the screen.");
	}
	public void enemyShoot() {
		System.out.println(getName() + "attacker and shooter " + getDamage());
	}
}
