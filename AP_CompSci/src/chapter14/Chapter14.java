package chapter14;

import java.util.Random;
import java.util.Scanner;
public class Chapter14{
	public static void main(String[] args){
//		new Chapter14_1();
//		new Chapter14_2();
		new Chapter14_3();
	}
	
}

class Chapter14_3{
	
	
	
	public Chapter14_3(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers with spaces");
		String[] input = scanner.nextLine().split(" ");
		scanner.close();
		
		Integer[] array = new Integer[input.length];
		for(int i = 0; i<input.length; i++){
			array[i] = Integer.parseInt(input[i]);
		}
		
			for(int i : Remove.removeAll(array,10)){
				System.out.print(i + ", ");
			}
		
	}
	
}

class Chapter14_2{
	
	
	
	public Chapter14_2(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers with spaces");
		String[] input = scanner.nextLine().split(" ");
		scanner.close();
		
		Integer[] array = new Integer[input.length];
		for(int i = 0; i<input.length; i++){
			array[i] = Integer.parseInt(input[i]);
		}
		
			for(int i : Remove.remove(array,10)){
				System.out.print(i + ", ");
			}
		
	}
	
}

class Remove{
	public static Integer[] remove(Integer[] array, Integer value){
		Integer index = -1;
		for(int i = 0; i < array.length; i++){
			if(array[i] == value){
				index = i;
				break;
			}
		}
		if(index == -1){
			return array;
		}
		Integer[] finalArray = new Integer[array.length-1];
		for(int i = 0; i < index; i++){
			finalArray[i] = array[i];
		}
		for(int i = index; i < finalArray.length; i++){
			finalArray[i] = array[i+1]; 
		}
		return finalArray;
	}
	public static Integer[] removeAll(Integer[] array, Integer value){
		Integer index = -1;
		Integer[] finalArray = new Integer[array.length-1];
		for(int i = 0; i < array.length; i++){
			if(array[i] == value){
				index = i;
				System.out.println(index);
				for(int j = 0; j < index; j++){
					finalArray[j] = array[j];
				}
				for(int j = index; j < finalArray.length; j++){
					finalArray[j] = array[j+1]; 
				}
				array = finalArray.clone();

			}
			
		}

		if(index == -1){
			return array;
		}
		return finalArray;
	}
}

class Chapter14_1{
	public Chapter14_1(){
		Random random =  new Random();
		Integer[] testArray = new Integer[20];
		for(int i = 0; i < testArray.length; i++){
			testArray[i] = random.nextInt(100);
		}
		for(Integer item : testArray){
			System.out.print(item + ", ");
		}
		System.out.println();
		InsertionSort.sort(testArray);
		for(Integer item : testArray){
			System.out.print(item + ", ");
		}
		int testValue = testArray[random.nextInt(testArray.length)];
		System.out.print("\n" + testValue + " is in array index ");
		System.out.println(BinarySearcher.search(testArray, 0, testArray.length, random.nextInt(100)));
	}
	
}

class InsertionSort 
{
	public static <T extends Comparable<T>> void sort(T[] array){
		for(int i = 1; i<array.length; i++){
			int j = i-1;
			T comparator = array[j+1];
			while(j >= 0 && comparator.compareTo(array[j])<0){  //swap until 
				array[j+1] = array[j];
				array[j] = comparator;
				
				j--;
				comparator = array[j+1];

			}
			
		}
	}
	
}
