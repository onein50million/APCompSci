package chapter14;

import java.util.Random;
import java.util.Scanner;

public class Chapter14 {
	public static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("14-1");
		new Chapter14_1();
		System.out.println("14-2");
		new Chapter14_2();
		System.out.println("14-3");
		new Chapter14_3();
		scanner.close();
	}

}

class Chapter14_3 {

	public Chapter14_3() {
		System.out.println("Enter numbers with spaces");
		String[] input = Chapter14.scanner.nextLine().split(" ");

		Integer[] array = new Integer[input.length];
		for (int i = 0; i < input.length; i++) {
			array[i] = Integer.parseInt(input[i]);
		}
		System.out.println("Enter the number you want to remove:");
		for (int i : Remove.removeAll(array,
				Integer.parseInt(Chapter14.scanner.nextLine()))) {
			System.out.print(i + ", ");
		}
		System.out.println();

	}

}

class Chapter14_2 {

	public Chapter14_2() {
		System.out.println("Enter numbers with spaces");
		String[] input = Chapter14.scanner.nextLine().split(" ");
		Integer[] array = new Integer[input.length];
		for (int i = 0; i < input.length; i++) {
			array[i] = Integer.parseInt(input[i]);
		}
		System.out.println("Enter the number you want to remove:");
		for (int i : Remove.remove(array,
				Integer.parseInt(Chapter14.scanner.nextLine()))) {
			System.out.print(i + ", ");
		}

	}

}

class Remove {
	public static Integer[] remove(Integer[] array, Integer value) {
		Integer index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			return array;
		}
		Integer[] finalArray = new Integer[array.length - 1];
		for (int i = 0; i < index; i++) {
			finalArray[i] = array[i];
		}
		for (int i = index; i < finalArray.length; i++) {
			finalArray[i] = array[i + 1];
		}
		return finalArray;
	}

	public static Integer[] removeAll(Integer[] array, Integer value) {
		Integer index = -1;
		Integer[] finalArray = array.clone();
		InsertionSort.sort(finalArray);
		for (index = BinarySearcher.search(finalArray, 0, finalArray.length,
				value); index != -1; index = BinarySearcher.search(finalArray,
				0, finalArray.length, value)) {
			for (int i = index; i < finalArray.length - 1; i++) {
				finalArray[i] = finalArray[i + 1];
			}
			Integer[] temp = new Integer[finalArray.length - 1];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = finalArray[i];
			}
			finalArray = temp;
		}

		return finalArray;
	}
}

class Chapter14_1 {
	public Chapter14_1() {
		Random random = new Random();
		Integer[] testArray = new Integer[20];
		for (int i = 0; i < testArray.length; i++) {
			testArray[i] = random.nextInt(100);
		}
		for (Integer item : testArray) {
			System.out.print(item + ", ");
		}
		System.out.println();
		InsertionSort.sort(testArray);
		for (Integer item : testArray) {
			System.out.print(item + ", ");
		}
		int testValue = testArray[random.nextInt(testArray.length)];
		System.out.print("\n" + testValue + " is in array index ");
		System.out.println(BinarySearcher.search(testArray, 0,
				testArray.length, random.nextInt(100)));
	}

}

class InsertionSort {
	public static <T extends Comparable<T>> void sort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i - 1;
			T comparator = array[j + 1];
			while (j >= 0 && comparator.compareTo(array[j]) < 0) { // swap until
				array[j + 1] = array[j];
				array[j] = comparator;
				j--;
				comparator = array[j + 1];

			}

		}
	}

}
