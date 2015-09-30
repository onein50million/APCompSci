import java.util.Random;

public class Spinner {

	public static void main(String[] args) throws InterruptedException {
				
		Random r = new Random();
		int classSize = 30;
		double speed = r.nextInt(10)+5;
		double rate = 0.9;
		
		int[] numbers = new int[classSize];
		for (int i = 0; i < classSize; i++) {
			
			numbers[i] = i+1;
		}
		
		int number = 0;

		while(true){
			try{
			
			number += Math.round(speed);
			speed *= rate;
			System.out.println(numbers[number]);

			
			
			}
			catch (ArrayIndexOutOfBoundsException e){
				
				number -= numbers.length;
				
			}
			Thread.sleep(100);
		}

		
	}

}
