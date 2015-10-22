package chapter5;

import javax.swing.JOptionPane;

public class Chapter5_8 {
	
		static double checkBalance;
		static double saveBalance;
		
	public static void main(String[] args) {

		Object[] transactionTypes = {"deposit", "withdraw", "transfer"};
		Object[] targetTypes = {"checking", "savings"};
		

		checkBalance = Double.parseDouble(JOptionPane.showInputDialog("Checking account balance"));
		if(checkBalance<0){
			JOptionPane.showMessageDialog(null, "Balance is negative","Error",JOptionPane.ERROR_MESSAGE);
			return;
		}
		saveBalance = Double.parseDouble(JOptionPane.showInputDialog("Savings account balance"));
		if(saveBalance<0){
			JOptionPane.showMessageDialog(null, "Balance is negative","Error",JOptionPane.ERROR_MESSAGE);
			return;
		}
		String type = (String)JOptionPane.showInputDialog(null,"Transaction type", "Input", JOptionPane.QUESTION_MESSAGE, null, transactionTypes, transactionTypes[0]);
		String target =(String)JOptionPane.showInputDialog(null,"Target", "Input", JOptionPane.QUESTION_MESSAGE, null, targetTypes, targetTypes[0]);
		double value = Math.abs(Double.parseDouble(JOptionPane.showInputDialog("How much would you like to " + type + "?")));
		
		transact(type,target,value);
		
	}
	
	private static void transact(String type, String target, double value) {
		
		if(type.equals("deposit")){
			if(target.equals("checking")){ checkBalance += value;}
			else if(target.equals("savings")){ saveBalance += value;}			
		}
		if(type.equals("withdraw")){
			if(target.equals("checking") && checkBalance > value){ checkBalance -= value;}
			else if(target.equals("savings") && saveBalance > value){ saveBalance -= value;}
			else{JOptionPane.showMessageDialog(null, "Cannot overdraw account","Error",JOptionPane.ERROR_MESSAGE); return;}
		}
		if(type.equals("transfer")){
			if(target.equals("checking") && saveBalance > value){ checkBalance += value; saveBalance -= value;}
			else if(target.equals("savings") && checkBalance > value){ saveBalance += value; checkBalance -= value;}
			else{JOptionPane.showMessageDialog(null, "Cannot overdraw account","Error",JOptionPane.ERROR_MESSAGE); return;}
		}
		
		JOptionPane.showMessageDialog(null,String.format("Checking: $%.2f\nSavings: $%.2f",checkBalance,saveBalance),"Final Balances",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
