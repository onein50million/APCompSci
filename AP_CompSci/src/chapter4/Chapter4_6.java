package chapter4;

import javax.swing.JOptionPane;

public class Chapter4_6 {

	public static void main(String[] args) {

		String number = JOptionPane.showInputDialog("Please enter an unformatted phone number");
		String formattedNumber = String.format("(%s) %s-%s",number.substring(0,3),number.substring(3,6),number.substring(6,10));
		System.out.printf("The formatted phone number is %s", formattedNumber);
		
	}

}
