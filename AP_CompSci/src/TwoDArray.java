import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {

		Object[] test = {"safsfssfs", 5435, 34.00, true};
		if((boolean)test[3]){
			System.out.println("woah");
		}
	}
	public  int[] withoutTen(int[] nums) {
		int[] temp = nums.clone();
		int tenCount = 0;
		for(int i : nums){
			if(i==10){
				tenCount++;
			}
		}
		while (tenCount > 0) {
			for (int i = 0; i < temp.length; i++) {
				if (temp[i] == 10) {
					tenCount--;
					for (int j = i; j < temp.length-1; j++) {
						temp[j] = temp[j + 1];

					}
					temp[nums.length - 1] = 0;
					break;
				}
			}
		}

		return temp;
	}
}
