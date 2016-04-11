package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Chapter14{
	public static void main(String[] args){
		new Chapter14_1();
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
	}
	
}

class InsertionSort
{
	public static <T extends Comparable<? super T>> void sort(T[] array){
		List<T> sorted = new ArrayList<T>();
		for(T item : array){
			if(sorted.size() == 0){
				sorted.add(item);
			}
			for(int i = 0; i<sorted.size(); i++){
				if(item.compareTo(sorted.get(i))<0){
					sorted.add(item);
				}
			}
		}
		for(int i = 0; i<array.length; i++){
			array[i] = sorted.get(i);			
		}
		
		
	}
	
}
