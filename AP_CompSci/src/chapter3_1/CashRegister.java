package chapter3_1;

/**
 * Cash Register Class, everything is in cents
 * @author Daniel Wart
 *
 */
public class CashRegister {
	
	private float purchase = 0;
	private float payment = 0;
	
	private float tax = 0;
	private float taxCost = 0;
	private int purchasedItems = 0;
	private float change = 0;

	/**
	 * @param  tax in percent
	 */
	public CashRegister(float tax){
		
		this.tax = tax/100f;
		
	}
	
	/** adds a purchase
	 * @param  price in cents
	 */
	public void recordPurchase(int cents) {
		purchasedItems++;
		purchase += cents;
		
	}
	
	/** adds a tax purchase
	 * @param  price in cents
	 */
	public void recordTaxablePurchase(int cents) {
		
		purchase += Math.round((float)cents*(tax+1f));
		taxCost += Math.round((float)cents*tax);
		purchasedItems++;
		
	}
	
	/** Customer pays
	 * @param  amount paid
	 */
	public void receivePayment(int cents) {
		payment += cents;
	}
	
	/**
	 * gives customer change
	 * @return change to be given
	 */
	public int getChange(){
		
		if (payment >= purchase) {
			
			change = payment - purchase;
			payment = 0;
			purchase = 0;
			return Math.round(change);
		} else {
			System.out.println("No");
			return 0;
		}
		
	}
	/**
	 * @return amount of items bought
	 */
	public int getItemCount() {
		
		return purchasedItems;
		
	}
	
	/**
	 * @return price of tax
	 */
	public int getTotalTax(){

		return Math.round(taxCost);
		
	}
	
	
}
