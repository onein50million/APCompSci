package chapter6_4;

public class PartA {
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++){
			for(int j = i; j<=10*i; j+=i){
				System.out.printf("%-4d", j);
			}
			System.out.println();
		}
	}
}