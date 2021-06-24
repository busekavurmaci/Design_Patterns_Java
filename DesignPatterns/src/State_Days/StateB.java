package State_Days;

public class StateB implements IState{

	private int count = 0;
	@Override
	public void writeName(StateContext stateContext, String name) {
		System.out.println(name.toUpperCase());
		if(++count > 1) {  //2 upper case, 1 lower case
			stateContext.SetState(new StateA());
		}
	}
	
}
