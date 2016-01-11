package chapter7;

import java.util.Arrays;

public class Chapter7_3 {

	public static void main(String[] args) {
		int[] array = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		array = rotN(array,9);
		System.out.println(Arrays.toString(array));
		
	}
	private static <T> T[] rotN(T[] array, int rotNum){
		T[] newArray = array.clone();
		for(int i = 0; i<array.length;i++){
			newArray[(i+rotNum)%array.length] = array[i];
		}
		return newArray;
	}
	
}
