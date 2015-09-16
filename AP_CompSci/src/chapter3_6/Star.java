package chapter3_6;	

import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Star {

	double x;
	double y;
	int divisor;
	int distanceChange;
	int distance;
	int distanceMultiplier;
	double shift;
	
	public Star(double x, double y,	int divisor, int distanceChange, int distance, int distanceMultiplier, double shift) {
		
		this.x = x;
		this.y = y;
		this.divisor = divisor;
		this.distanceChange = distanceChange; 
		this.distance = distance;
		this.distanceMultiplier = distanceMultiplier;
		this.shift = shift;
	}
	
	public void draw(Graphics2D graphic){
		
		for (double i = 0; i < 2 * Math.PI; i+= Math.PI/divisor) {
			
			graphic.draw(new Line2D.Double(x,
					y,
					x+Math.cos(i)*(distance + distanceMultiplier*Math.sin(i*distanceChange)),
					y+Math.sin(i)*(distance + distanceMultiplier*Math.sin(i*distanceChange))));			
		}
		
	}

}
