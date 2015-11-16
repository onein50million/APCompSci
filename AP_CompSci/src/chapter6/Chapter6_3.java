package chapter6;

import java.util.Scanner;

public class Chapter6_3 {
	

	public static void main(String[] args) {

	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		long input = scan.nextLong();
		scan.close();
		System.out.println("factors:");
		factor(input,2,2);
	}

	public static long f(long x){
		
		return x*x+1;
		
	}
	
	public static boolean primeCheck(long number){
		for(long i = 2; i<=Math.sqrt(number);i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void factor(long input,long a,long b){
				
		if(primeCheck(input)){
			System.out.println("Prime number");
			return;
		}


		long x = a;
		long y = b;
		

		
		long factor = 1;
		if(input%2 == 0){
			factor = 2;
		}
		else{
			while (factor == 1) {
				x = f(x) % input;
				y = f(f(y))% input;
	//			System.out.println("x:" + x + " y:" + y);				
	//			System.out.println(gcd(Math.abs(y-x),input));
				factor = gcd(Math.abs(y-x),input);			
			}
		}
		if(primeCheck(factor)){
			System.out.println(factor);
		}
		else{
			factor(factor,a+1,b+1);
		}
		if(primeCheck(input/factor)){
			System.out.println(input/factor);
		}
		else{
			factor(input/factor,a+1,b+1);
		}
//		System.out.println(factor);
	}
	
	public static long gcd(long value1, long value2) {

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
