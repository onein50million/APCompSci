package chapter5;

import javax.swing.JOptionPane;

public class Chapter5_5 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("enter year: ");
		int year = Integer.parseInt(input);
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.printf("%d is a leap year", year);

		} else {
			System.out.printf("%d is not a leap year", year);

		}

	}
}
