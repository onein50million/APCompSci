package chapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentTester {

	static List<Appointment> appointments = new ArrayList<Appointment>();

	public static void main(String[] args) {
		System.out.println("Enter an available command: add <onetime, daily, monthly> year month day \"description\", check year month day, quit\n"
				+ "No date needed for daily, only day needed for monthly, year month and day needed for onetime\n"
				+ "Example: add onetime 2016 04 08 \"My birthday\"");
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\n");
		while (true) {
			try{
			String raw = scan.next();
			String[] input = raw.replaceAll("\r", "").split(" ");
			String command = input[0].toLowerCase();
			
			if (command.equals("add")) {
				String type = input[1].toLowerCase();
				String descriptor = raw.split("\"")[1];
				
				if (type.equals("onetime")) {
					int[] date = { Integer.parseInt(input[2]), Integer.parseInt(input[3]), Integer.parseInt(input[4])};
					Onetime appointment = new Onetime(date, descriptor);
					appointments.add(appointment);
					
				} else if (type.equals("daily")) {
					appointments.add(new Daily(descriptor));
				
				} else if (type.equals("monthly")) {
					int day = Integer.parseInt(input[2]);
					appointments.add(new Monthly(day,descriptor));
					
				} else {
					System.out.println("Please enter a valid appointment type (\"onetime\" \"daily\" \"monthly\")");
				}
			} else if (command.equals("check")) {
				int[] date = {Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[3])};
				for(Appointment i:appointments){
					if(i.sameDay(date)){
						System.out.println(i.descriptor);
					}
				}
				
			} else if (command.equals("quit")) {
				break;
			} else {
				System.out.println("Please enter a valid command (\"add\" \"check\" \"quit\")");
			}

			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Missing parameter");
			}

		}
	}

}
