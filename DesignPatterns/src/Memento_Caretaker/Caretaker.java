package Memento_Caretaker;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	private List<Object> savedStates = new ArrayList<>();
	
	public void addMemento(Object m) {
		savedStates.add(m);
	}
	
	public Object getMemento(int index) {
		return savedStates.get(index);
	}
}
