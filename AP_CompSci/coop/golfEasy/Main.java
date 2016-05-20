package golfEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> lines = new ArrayList<String>();
		int totalPar = 0;
		int totalScore = 0;
		while(true){
			String line = scanner.nextLine();
			if(line.equals("")){
				break;
			}
			lines.add(line);
		}
		for(String line : lines){
			int par = Integer.parseInt(line.split(" ")[0]);
			int score = Integer.parseInt(line.split(" ")[1]);
			int difference = score-par;
			totalPar += par;
			totalScore += score;
			if(difference == -1){				
				System.out.println("birdie");
			}else if(difference == -2){
				System.out.println("eagle");
			}else if(difference == 1){
				System.out.println("bogey");
			}else if(difference == 2){
				System.out.println("double bogey");
			}
		}
		
		if(totalPar - totalScore >=0)
			System.out.printf("%d under par",totalPar-totalScore);
		if(totalPar - totalScore < 0)	
			System.out.printf("%d over par", Math.abs(totalPar-totalScore));
	}

}
