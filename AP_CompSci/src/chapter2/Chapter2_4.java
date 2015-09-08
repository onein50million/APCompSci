package chapter2;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Chapter2_4 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		Rectangle rect = new Rectangle(100,100,100,100);
		frame.setBounds(rect);
		
		JOptionPane.showMessageDialog(frame, "Don't click OK to not continue");
		
		rect.translate(400,400);
		frame.setBounds(rect);
		
	}

}
