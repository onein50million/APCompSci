package chapter3_9;

public class Tester {

	public static void main(String[] args) {

		 		BankAccount USTreasury = new BankAccount(23.52, 3, 1);
		 		System.out.println(USTreasury.getBalance());
		 		USTreasury.withdraw(5);
		 		for (int i = 0; i < 5; i++) {
			 		USTreasury.deposit(3);
				}
		 		System.out.println(USTreasury.getBalance());
		 		USTreasury.payFee();
		 		System.out.println(USTreasury.getBalance());
		 		
		 		
		
	}

}
