package chapter6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Chapter6_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int input = scan.nextInt();
		int x = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		int i = 0;
		while (true) {
			x = (x * x + 1) % input;
			System.out.println(x);
			list.add(x);
			System.out.println(gcd(Math.abs(list.get(i)-list.get(i*2)),input));

		}

	}

	public static int gcd(int value1, int value2) {

		while (value1 > 0 && value2 > 0) {
			if (value1 >= value2) {
				value1 -= value2;
			} else {
				value2 -= value1;
			}
		}
		return value1 > value2 ? value1 : value2;
	}
}
