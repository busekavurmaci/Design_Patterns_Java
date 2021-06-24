package Memento_Caretaker;

public class Originator {
	
	private String state;
	
	public void set(String state) {
		System.out.println("Originator " + state);
		this.state = state;
	}
	
	public Object saveToMemento() {
		System.out.println("Originator: Saving to Memento");
		return new Memento(state);
	}
	
	public void restoreFromMemento(Object m) {
		if(m instanceof Memento) {
			Memento memento = (Memento) m;
			state = memento.getSavedState();
			System.out.println("Originator: State after restoring from memento " + state);
		}
	}

}
