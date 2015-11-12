package chapter6;

import java.util.Scanner;

public class Chapter6_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("First number: ");
		int firstNum = scan.nextInt();
		System.out.print("Second number: ");
		int secondNum = scan.nextInt();
		System.out.println("Odd numbers between " + firstNum + " and " + secondNum);
		getOdd(firstNum,secondNum);
		System.out.println("Sum of even numbers between " + firstNum + " and " + secondNum);
		sumEven(firstNum,secondNum);
		System.out.println("Squares between 1 and 10");
		squares();
		System.out.println("sum of odd squares between " + firstNum + " and " + secondNum);
		oddSquares(firstNum, secondNum);
		
	}
	// prints odds
	private static void getOdd(int first, int second){
		first = first % 2 == 0? first + 1: first;
		for(int i = first; i<=second; i+=2){
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	// sums even
	private static void sumEven(int first, int second){
		first = first % 2 == 0? first: first + 1;
		int sum = 0;
		for(int i = first; i<=second; i+=2){
			sum+=i;
		}
		System.out.println(sum);
	}
	// prints squares
	private static void squares(){
		for (int i = 1; i < 10 ; i++) {

			System.out.print(i*i + " ");
			
		}
		System.out.println();
		
	}
	//sums odd squares
	private static void oddSquares(int first, int second){
		int sum = 0;
		first = first % 2 == 0? first + 1: first;
		for(int i = first; i<=second; i+=2){
			sum += i*i;
		}
		System.out.println(sum);
	}
	
	
}
