package Mediator_Book;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class Main extends JFrame implements ActionListener{
		
		Mediator mediator = new Mediator();

	public Main(){
		JPanel p = new JPanel();
		p.add(new ButtonView(this, mediator));
		p.add(new ButtonBook(this, mediator));
		p.add(new ButtonSearch(this, mediator));
		getContentPane().add(new LabelDisplay(mediator), BorderLayout.NORTH);
		
		getContentPane().add(p, BorderLayout.SOUTH);
		setTitle("Mediator Testing Example");
		setSize(500,500);
		
		addWindowListener(new WindowAdapter(){
			
			@Override
			public void windowClosing(WindowEvent e){
				super.windowClosing(e);
				
				System.exit(0);
			}
		});
			
			setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof ICommand) {
			ICommand c = (ICommand) e.getSource();
			c.execute();
		}
	
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
	
}
