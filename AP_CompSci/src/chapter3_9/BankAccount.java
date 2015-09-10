package chapter3_9;

public class BankAccount {

	double balance;
	
	int monthlyTransactions = 0;
	int freeTransactions;
	double fee;
	
	public BankAccount(double balance, int freeTransactions, double fee) {
		
		this.balance = balance;
		this.freeTransactions = freeTransactions;
		this.fee = fee;
		
	}
	
	public double getBalance() {
		
		return balance;
		
	}
	
	public void withdraw(int money) {

		balance -= money;
		monthlyTransactions++;
		
	}
	public void deposit(int money) {
		
		balance += money;
		monthlyTransactions++;
		
	}
	public void payFee(){
		
		balance -= Math.max(Math.max(monthlyTransactions,freeTransactions) - freeTransactions, 0)*fee;
		monthlyTransactions = 0;
		
	}
	
	
}
