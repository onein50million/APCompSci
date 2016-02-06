package chapter8;

import java.util.Scanner;

public class CustomerTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Customer customer =  new Customer();
		System.out.println("Purchase Cost:");

		while(scanner.hasNext()){
			Double input = scanner.nextDouble();
			if(input == -1){
				break;
			}
			System.out.println("Purchase Cost:");
			customer.makePurchase(input);
		}
		System.out.println(customer.getSale());

	}

}
