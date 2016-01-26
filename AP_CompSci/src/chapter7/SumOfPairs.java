package chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SumOfPairs {

	public static void main(String[] args) throws FileNotFoundException {

		File input = new File("SumInput.txt");
		Scanner scanner = new Scanner(input);
		String[] nums = scanner.nextLine().split(" ");
		scanner.close();
		
		for(String num : nums){
			System.out.println("Pairs for " + num + ": " + pairToString(getPairs(Integer.parseInt(num))));
		}

		
	}
	public static ArrayList<Integer[]> getPairs(int number){
		
		ArrayList<Integer> possiblePairs = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10,11}));
		ArrayList<Integer[]> pairs  = new ArrayList<Integer[]>();
		for(int i = 0; i<possiblePairs.size();i++){
			for(int j = 0; j<possiblePairs.size();j++){
				if(possiblePairs.get(i) != possiblePairs.get(j) && possiblePairs.get(i)+possiblePairs.get(j) == number){
					pairs.add(new Integer[]{possiblePairs.get(i),possiblePairs.get(j)});
					possiblePairs.remove(j);
				}
			}
		}

		return pairs;
	}

	public static String pairToString(ArrayList<Integer[]> pairs){
		String output = "";
		for(Integer[] pair:pairs){
			output += "[" +  pair[0] + ", ";
			output += pair[1] + "] ";
		}
		return output;
	}
	
}
