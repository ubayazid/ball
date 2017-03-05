package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyPanel extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		Graphics2D pen = (Graphics2D)g;
		
		pen.setColor(Color.blue);
		
		pen.fillRect(20, 20, 50, 50);
		
		
		
		
		
	}
	
}
