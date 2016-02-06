package chapter8;

public class Customer {

	private double sale = 0;
	private double tempSale = 0;
	private int discountCount = 0;

	public void makePurchase(double amount) {

		if(tempSale>100){
			System.out.println("Discount added");
			discountCount += 1;
			tempSale = 0;
		}
		
		sale += amount-10*discountCount;
		tempSale += amount-10*discountCount;
		if(discountCount>0){
			discountCount--;
		}
		

	}

	public double getSale() {
		return sale;
	}

}
