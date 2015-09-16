package chapter3_1;

/**
 * Cash Register Class, everything is in cents
 * @author Daniel Wart
 *
 */
public class CashRegister {
	
	private int purchase = 0;
	private int payment = 0;
	
	private float tax = 0;
	private int taxCost = 0;
	private int purchasedItems = 0;
	private int change = 0;

	/**
	 * @param  tax in percent
	 */
	public CashRegister(int tax){
		
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
		
		purchase += cents;
		purchase += Math.round((float)cents*tax);
		taxCost += Math.round((float)cents*tax);
		
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
			return change;
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

		return taxCost;
		
	}
	
	
}
