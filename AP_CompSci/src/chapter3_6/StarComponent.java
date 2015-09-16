package chapter3_6;

import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class StarComponent extends JComponent {

	public void paintComponent (Graphics g){
		
		Graphics2D graphics = (Graphics2D) g;
		Star star1 = new Star(100,100,8,4,30,10,0);
		Star star2 = new Star(250,250,8,4,30,10,0);
		Star star3 = new Star(400,400,8,4,30,10,0);
		star1.draw(graphics);
		star2.draw(graphics);
		star3.draw(graphics);
		
		
	}
	
	
}
