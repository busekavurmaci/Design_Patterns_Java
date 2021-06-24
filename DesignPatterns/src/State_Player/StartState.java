package State_Player;

public class StartState implements IState{

	@Override
	public void doAction(Context context) {
		System.out.println("---- Player is in the start state -----");
		context.setState(this);
	}
	public String toString() {
		return "Start state does action some action.";	
	}
}
