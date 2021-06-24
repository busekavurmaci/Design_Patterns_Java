package State_Player;

public class StopState implements IState{

	@Override
	public void doAction(Context context) {
		System.out.println("----- Player is in the stop state -----");
		context.setState(this);
	}
	public String toString() {
		return "Stop State no action at all.";	
	}
	
}
