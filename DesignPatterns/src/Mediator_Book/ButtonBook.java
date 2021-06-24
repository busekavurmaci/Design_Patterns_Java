package Mediator_Book;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ButtonBook extends JButton implements ICommand{

	Mediator mediator;
	
	ButtonBook(ActionListener listener, Mediator mediator){
		super("List book");
		addActionListener(listener);
		this.mediator = mediator;
		mediator.registerBook(this);
		
	}

	@Override
	public void execute() {
		mediator.book();
	}
	
	
}
