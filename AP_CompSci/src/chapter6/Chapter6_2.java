package chapter6;

import java.util.Scanner;


public class Chapter6_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("First number: ");
		int first = scan.nextInt();
		System.out.print("Second number: ");
		int second = scan.nextInt();
		scan.close();
		
		int[] input = {first,second};
		System.out.println("The GCD is: " + gcd(input));

	
		
	}
	
	public static int gcd(int[] values) {

		int[] inputValue = { values[0], values[1] };

		while (inputValue[0] > 0 && inputValue[1] > 0) {
			if (inputValue[0] >= inputValue[1]) {
				inputValue[0] -= inputValue[1];
			} else {
				inputValue[1] -= inputValue[0];
			}
		}
		return inputValue[0]>inputValue[1]?inputValue[0]:inputValue[1];
	}
}
