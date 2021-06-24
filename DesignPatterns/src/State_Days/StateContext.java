package State_Days;

public class StateContext{
	private IState myState;
	
	public StateContext() {
		SetState(new StateA());
	}
	
	public void SetState(IState stateName) {
		this.myState = stateName;
	}
	
	public void writeName(String name) {
		this.myState.writeName(this, name);
	}

}
