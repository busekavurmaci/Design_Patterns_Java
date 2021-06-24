package Flyweight_Colors;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class FlyweightPattern_Main extends JFrame{
	
	JButton startDrawing;
	int windowWidth = 900;
	int getWindowHeight = 650;
	
	Color[] shapeColor = {Color.black, Color.blue, Color.cyan, Color.gray, Color.magenta, Color.orange, Color.green, Color.pink, Color.yellow, Color.red};
	
	public static void main(String[] args) {
		
		new FlyweightPattern_Main();
	}
	
	public FlyweightPattern_Main() {
		this.setSize(windowWidth, getWindowHeight);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Flyweight Pattern Project");
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		
		final JPanel drawingPanel = new JPanel();
		startDrawing = new JButton("Draw Stuff");
		
		contentPane.add(drawingPanel, BorderLayout.CENTER);
		contentPane.add(startDrawing, BorderLayout.SOUTH);
		
		startDrawing.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = drawingPanel.getGraphics();
				long startTime = System.currentTimeMillis();
				for(int i=0; i<10000; ++i) {
					
					MyRect rect = RectFactory.getRect(getRandColor());
					rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
				}
				long endTime = System.currentTimeMillis();
				System.out.println("That took "+ (endTime - startTime));
			}
		});
		
		this.add(contentPane);
		this.setVisible(true);
	}
	
	private Color getRandColor() {
		Random randomGenerator = new Random();
		int randInt = randomGenerator.nextInt(9);
		return shapeColor[randInt];
	}
	
	private int getRandX() {
		return (int)(Math.random()*windowWidth);
	}
	
	private int getRandY() {
		return (int)(Math.random()*getWindowHeight);
	}

}
