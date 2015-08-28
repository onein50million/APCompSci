public class AlphabetDistance {

	public static void main(String[] args) {

		
		
	}
	
	
	public static void distance(String input) {
		input = input.toUpperCase();
		String inputSplit[] = input.split(" ");

		if (inputSplit.length > 2) {
			System.out.println("more than two strings");
		}

		char[] charArray0 = inputSplit[0].toCharArray();
		char[] charArray1 = inputSplit[1].toCharArray();

		for (int i = 0; i < charArray0.length; i++) {

			if (charArray1[i] >= charArray0[i]) {
				System.out.print(charArray1[i] - charArray0[i] + " ");
			} else {
				System.out.print(charArray1[i] + 26 - charArray0[i] + " ");
			}

		}
	}
	
	

}
