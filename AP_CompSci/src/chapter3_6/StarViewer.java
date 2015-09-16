package chapter3_6;

import java.awt.Graphics2D;

import javax.swing.JFrame;

public class StarViewer {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StarComponent comp = new StarComponent();
		frame.add(comp);
		frame.setVisible(true);

	}

}
