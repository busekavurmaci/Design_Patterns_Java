package State_Days;

public class StateA implements IState{

	@Override
	public void writeName(StateContext stateContext, String name) {
		System.out.println(name.toLowerCase());
		stateContext.SetState(new StateB());
	}
	
}