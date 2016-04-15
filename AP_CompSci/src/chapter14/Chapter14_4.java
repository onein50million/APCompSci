package chapter14;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter14_4 {
	
	static final int SUCCESS = 0;
	static final int OUT_OF_RANGE = 1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers with spaces");
		String[] stringArrayInput = scanner.nextLine().split(" ");
		int[] intArrayInput = new int[stringArrayInput.length];
		for(int i = 0; i < stringArrayInput.length; i++){
			intArrayInput[i] = Integer.parseInt(stringArrayInput[i]);
		}

		System.out.println("Enter a number and an index to insert at (number index) eg. 10 2");
		String[] stringInput = scanner.nextLine().split(" ");
		int[] intInput = new int[stringInput.length];
		
		for(int i = 0; i < stringInput.length; i++){
			intInput[i] = Integer.parseInt(stringInput[i]);
		}
		
		int result = insertAt(intArrayInput, intInput[1], intInput[0]);
		if(result == 0){
			System.out.println(Arrays.toString(intArrayInput));
		}else if(result == 1){
			System.out.println("Index out of range");
		}
		
		scanner.close();
	}

	private static int insertAt(int[] array, int index, int item){
		if(index > array.length){
			return OUT_OF_RANGE;
		}
		int[] output = new int[array.length+1];
		System.arraycopy(array, 0, output, 0, index);

		output[index] = item;
		System.arraycopy(array, index,output, index+1, array.length-index);

		array = output.clone();
		return SUCCESS;
	}
	
}
