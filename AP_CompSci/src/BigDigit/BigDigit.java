package BigDigit;

import java.util.Iterator;
import java.util.LinkedList;

public class BigDigit {

	private int number;
	private int length;
	
	public BigDigit(int number){
		
		this.number = number;
		this.length = Integer.toString(number).length();
				
	}
	
	public void print(){
		
		LinkedList<Integer> digits = new LinkedList<Integer>();
		for(int i = 10; i<=Math.pow(10,this.length); i*=10){
			
			digits.push((this.number%i)/(i/10));
			
		}
		
		while(!digits.isEmpty()){
			switch(digits.getFirst()){

			
			
			}
		}
		
	}
	
}
