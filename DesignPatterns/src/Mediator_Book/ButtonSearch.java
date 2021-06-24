package Mediator_Book;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ButtonSearch extends JButton implements ICommand{

    Mediator mediator;
	
    ButtonSearch(ActionListener listener, Mediator mediator){
		super("Search");
		addActionListener(listener);
		this.mediator = mediator;
		mediator.registerSearch(this);
		
	}

	@Override
	public void execute() {
		mediator.search();
	}
	
}
