import java.util.Random;


public class Chapter2_5 {

	public static void main(String[] args) {

		Random num = new Random();
		System.out.print("Pick these numbers: ");
		
		for(int i = 0; i<6; i++){
		
			System.out.print(num.nextInt(49)+1 + " ");
			//tretrete
		}
	}
		
}

