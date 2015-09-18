package chapter3_1;

public class TestClass {

	public static void main(String[] args) {
		double x = 2.5;
		double y = -1.5;
		int m = 18;
		int n = 4;
		
		CashRegister register = new CashRegister(10);
		register.recordPurchase(2950);
		register.recordTaxablePurchase(925);
		register.recordPurchase(400);
		register.recordTaxablePurchase(1215);
		register.receivePayment(6000);
		System.out.printf("You purchased %s items\n", register.getItemCount());
		System.out.printf("Tax is $%.2f\n", register.getTotalTax()/100f);
		System.out.printf("Your change is: $%.2f\n", register.getChange()/100f);
		
		System.out.println(m%n);
		
	}

}
