import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(withoutTen(new int[] { 32, 5453, 10, 434, 10 })));

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
