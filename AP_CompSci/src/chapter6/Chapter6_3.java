package chapter6;

import java.util.Scanner;

public class Chapter6_3 {
	

	public static void main(String[] args) {

	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int input = scan.nextInt();
		scan.close();
		System.out.println("factors:");
		factor(input,2,2);
	}

	public static int f(int x){
		
		return x*x+1;
		
	}
	
	public static boolean primeCheck(int number){
		for(int i = 2; i<=Math.sqrt(number);i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void factor(int input,int a,int b){
				
		if(primeCheck(input)){
			System.out.println("Prime number");
			return;
		}

		int x = a;
		int y = b;
		
		int factor = 1;
		while (factor == 1) {
			x = f(x) % input;
			y = f(f(y))% input;
//			System.out.println("x:" + x + " y:" + y);				
//			System.out.println(gcd(Math.abs(y-x),input));
			factor = gcd(Math.abs(y-x),input);		
			
			}
//		if(primeCheck(factor)){
//			System.out.println(factor);
//		}
//		else{
//			x++;
//			y++;
//			factor(factor,a+1,b+1);
//		}
//		if(primeCheck(input/factor)){
//			System.out.println(input/factor);
//		}
//		else{
//			x++;
//			y++;
//			factor(input/factor,a+1,b+1);
//		}
		System.out.println(factor);
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
