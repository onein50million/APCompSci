package chapter6;

import java.util.Scanner;

public class Chapter6_3_trial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		long input = scan.nextLong();
		scan.close();
		System.out.println("factors:");
		while(true){
			for(int i = 2; i <= Math.sqrt(input);i++){				
				if(primeCheck(i) && input%i == 0){
					if(primeCheck(input/i)){
						System.out.println(i);
						System.out.println(input/i);
						return;
					}
					System.out.println(i);
					input /= i;
					break;
				}
			}
			
		}

	}


	public static boolean primeCheck(long number) {
		for (long i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
