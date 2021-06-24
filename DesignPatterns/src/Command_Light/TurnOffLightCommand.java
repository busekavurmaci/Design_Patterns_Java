package Command_Light;

public class TurnOffLightCommand implements ICommand{

	private Light theLight;
	
	public TurnOffLightCommand(Light light) {
		this.theLight = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		theLight.turnOff();
	}

}
