package chapter4;

import java.text.DateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Chapter4_2 {

	int year = 2016;

	
	public static void main(String[] args) {
		
		int year = Integer.parseInt(JOptionPane.showInputDialog("Please enter a year"));
		int y = year;
		int a = y % 19;
		int b = y / 100;
		int c = y % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (8 * b + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		int n = (h - m + r + 90) / 25;
		int p = (h - m + r + n + 19) % 32;

		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH,n-1);
		calendar.set(Calendar.DAY_OF_MONTH,p);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		String dateString = df.format(calendar.getTime());
		
		System.out.printf("Easter is on %s",dateString);
		
		
		
	}

}
