package chapter7;

import java.util.Arrays;

public class Chapter7_3 {

	public static void main(String[] args) {
		double[] array = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		array = rotN(array,3);
		System.out.println(Arrays.toString(array));
		//longer way below
		for(double value:array){
			System.out.print(value + " ");
		}
		
	}
	private static double[] rotN(double[] array, int rotNum){
		double[] newArray = array.clone();
		for(int i = 0; i<array.length;i++){
			newArray[(i+rotNum)%array.length] = array[i];
		}
		return newArray;
	}
	
}
