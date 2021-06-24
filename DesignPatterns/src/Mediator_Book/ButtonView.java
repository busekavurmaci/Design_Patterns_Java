package Mediator_Book;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ButtonView extends JButton implements ICommand{

    Mediator mediator;
	
    ButtonView(ActionListener listener, Mediator mediator){
		super("View");
		addActionListener(listener);
		this.mediator = mediator;
		mediator.registerView(this);
		
	}

	@Override
	public void execute() {
		mediator.view();
	}
	
	
}
