package Mediator_Book;

import javax.swing.JLabel;

public class LabelDisplay extends JLabel{

	Mediator mediator;
	
	LabelDisplay(Mediator mediator){
		super(" This book");
		this.mediator = mediator;
		mediator.registerDisplay(this);
	}
}
