package Command_Light;

public class Switch {

	private ICommand flipDownCommand;
	private ICommand flipUpCommand;
	
	public Switch(ICommand flipDownCmd, ICommand flipUpComd) {
		super();
		this.flipDownCommand = flipUpComd;
		this.flipUpCommand = flipDownCmd;
	}
	
	public void flipUp() {
		flipUpCommand.execute();
	}
	
	public void flipDown() {
		flipDownCommand.execute();
	}
	
}
