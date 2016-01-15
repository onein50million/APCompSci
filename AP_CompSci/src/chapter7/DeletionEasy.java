package chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeletionEasy {

	private List<Integer> sequence;
	int moves = 0;
	public DeletionEasy(int[] sequence){
		
		this.sequence = new ArrayList< Integer>() ;
		for (int i:sequence){this.sequence.add(i);}
		
	}
	public int start(){
		while(sequence.size()>0){
			System.out.println(sequence);
			//check for zeroes
			int zeroPos = -1;
			for(int i =0; i<sequence.size(); i++){
				if (sequence.get(i) == 0 && i > zeroPos){
					zeroPos = i;
				}
			}
			
			//remove zeroes
			if(zeroPos>=0){
				for(int i = 0; i<=zeroPos; i++){
					sequence.remove(0);
				}
				moves++;
				continue;
			}
			
			//find smallest
			int largest = sequence.get(sequence.size()-1);
			int smallPos = sequence.size()-1;
			for(int i = sequence.size()-1; i>=0 ;i--){
				if(sequence.get(i) > largest){
					largest = sequence.get(i);
					smallPos = i;
				}
			}
			//removes 2 from even, 1 from odd
			sequence.set(smallPos,sequence.get(smallPos)-((largest+1)%2+1));
			moves++;
		}
		return moves;
	}
	
	
}
