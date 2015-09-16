package chapter3_1;

public class TestClass {

	public static void main(String[] args) {
	
		CashRegister register = new CashRegister(8);
		register.recordTaxablePurchase(1000);
		register.recordTaxablePurchase(2000);
		register.recordTaxablePurchase(1000);
		register.receivePayment(1000);
		System.out.printf("Your change is: $%.2f", register.getChange()/100f);
		

	}

}
