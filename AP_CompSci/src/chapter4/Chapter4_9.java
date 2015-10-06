package chapter4;

import javax.swing.JOptionPane;

public class Chapter4_9 {


	
	public static void main(String[] args) {
		
		double balance;
		double interest;
		double frequency = 12;
		
		balance = Double.parseDouble(JOptionPane.showInputDialog("Balance: "));
		interest = Double.parseDouble(JOptionPane.showInputDialog("Interest rate in percent: "))/100;
		
		double month1 = balance * Math.pow(1d+interest/frequency, frequency*(1d/12d));
		double month2 = balance * Math.pow(1d+interest/frequency, frequency*(2d/12d));
		double month3 = balance * Math.pow(1d+interest/frequency, frequency*(3d/12d));
		
		System.out.printf("First Month: $%.2f\nSecond Month: $%.2f\nThird Month: $%.2f", month1,month2,month3);

		
		
	}

}
