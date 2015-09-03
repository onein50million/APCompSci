package chapter2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Chapter2_7 {
	
	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();
		GregorianCalendar birthday = new GregorianCalendar(1998, Calendar.APRIL, 8);
		SimpleDateFormat dateformat = new SimpleDateFormat("dd MMMM YYYY");
		SimpleDateFormat weekdayDate = new SimpleDateFormat("EEEE, dd MMMM YYYY");
		SimpleDateFormat weekday = new SimpleDateFormat("EEEE");
		
		date.add(Calendar.DAY_OF_MONTH,100);

		System.out.println("The date 100 days from now is: " + weekdayDate.format(date.getTime()));
		
		System.out.println("The weekday of my birthday is: " + weekday.format(birthday.getTime()));
		
		birthday.add(Calendar.DAY_OF_MONTH, 10000);
		
		System.out.println("The date 10,000 days after my birthday is: " + dateformat.format(birthday.getTime()));

	}

}
