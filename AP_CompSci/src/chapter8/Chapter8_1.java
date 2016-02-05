package chapter8;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter8_1 {

	static ArrayList<Student> students =  new ArrayList<Student>();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
		while(true){
			String stringIn = scanner.next();
			stringIn = stringIn.replace("\n", "").replace("\r","");
			String[] input = stringIn.split(" ");
			
			String name = input[0];
			double wage = Double.parseDouble(input[1]);
			double hours = Double.parseDouble(input[2]);
			students.add(new Student(name,wage,hours));

			if(input.length > 3 && input[3].equals("-1")){
				scanner.close();
				break;
			}

		}
		for(Student i:students){
			System.out.printf("Income for %1$s: %2$.2f\n"
					+ "Federal Tax for %1$s: %3$.2f\n"
					+ "Social Security Tax for %1$s: %4$.2f\n"
					+ "Check amount for for %1$s: %5$.2f\n\n"
					,i.name
					,i.salary
					,i.getFedTax()
					,i.getSSTax()
					,i.salary-(i.getFedTax()+i.getSSTax()));
		}
		
		
	}

}
