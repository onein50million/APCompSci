package chapter6_4;

import java.util.Scanner;

public class PartB {

	public static void main(String[] args) {
		
		int length = 5;
		// filled
		for (int i = 0; i < length; i++) {

			for (int j = 0; j < length; j++) {
				System.out.print("*");

			}
			System.out.print(" ");
			if (i == length - 1 || i == 0) {
				for (int j = 0; j < length; j++) {
					System.out.print("*");

				}
			} else {

				System.out.print("*");
				for (int j = 0; j < length - 2; j++) {

					System.out.print(" ");

				}
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
