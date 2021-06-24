package Memento_Caretaker;

public class Main {

	public static void main(String[] args) {
		
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
		
		originator.set("State 1");
		caretaker.addMemento(originator.saveToMemento());
		System.out.println();
		
		originator.set("State 2");
		caretaker.addMemento(originator.saveToMemento());
		System.out.println();
		
		originator.set("State 3");
		caretaker.addMemento(originator.saveToMemento());
		System.out.println();
		
		originator.set("State 4");
		originator.restoreFromMemento(caretaker.getMemento(1));
		System.out.println();
		

	}

}
