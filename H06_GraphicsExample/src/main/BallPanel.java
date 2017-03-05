package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class BallPanel extends JPanel{

	private int x = 50;
	private int y = 50;
	private int tableX=0;
	private int tableY=0;
	private int dx = 1;
	private int dy = 1;
	
	

	public int getTableX() {
		return tableX;
	}

	public void setTableX(int tableX) {
		this.tableX = tableX;
	}

	public int getTableY() {
		return tableY;
	}

	public void setTableY(int tableY) {
		this.tableY = tableY;
	}

	public BallPanel() {
		this.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
				x = e.getX()-15;
				y= e.getY()-15;
				
				repaint();
				
				
				
			}
			
		});
		
		
		this.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
			
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				
				
				x = e.getX()-15;
				y= e.getY()-15;
				
				repaint();
				
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D pen = (Graphics2D)g;
		
		pen.setColor(Color.RED);
		
		pen.fillArc(x, y, 30, 30, 0, 360);
		
	}
	
class Ball extends Thread implements Runnable{
		
	Thread threads = new Thread() {
		public void run (){
			while (true){
				
				tableX=getTableX();
			
				tableY=getTableY();
				
				x= x + dx;
				y= y + dy;
				
				if (x-15<0){
					
					dx=1;
					 x = 15;
					 
				} else if (x+15>=getWidth()){
					dx = -1;
					x= getWidth()-15;
					
				}
				
				if(y -15<0){
					dy=1;
					y=15;
					
				} else if (y+15>=getHeight()){
					dy = -1;
					y= getHeight()-15;
					
				}
				repaint();
				
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
	};

	 
		
	}
	
	
}
