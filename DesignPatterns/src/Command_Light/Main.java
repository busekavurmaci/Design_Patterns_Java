package Command_Light;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Light l = new Light();
		
		ICommand switchUp = new TurnOnLightCommand(l);
		ICommand switchDown = new TurnOffLightCommand(l);
		
		Switch s = new Switch(switchUp, switchDown);
		s.flipUp();
		s.flipDown();
	}

}
