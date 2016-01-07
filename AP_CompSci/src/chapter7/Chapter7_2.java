package chapter7;

public class Chapter7_2 {

	public static void main(String[] args) {
		//a
		double[] betterMagic = { 8, 4, 5,21, 7, 9, 18, 2, 100};
		//b
		double total = 0;
		for(double value:betterMagic){
			total += value;
		}
		System.out.println("total: "+ total);
		//c
		total = 0;
		for(int i = 0; i<betterMagic.length;i++){
			total += betterMagic[i];
		}
		System.out.println("total: " + total);
		//d
		double min = betterMagic[0];
		int iteration = 0;
		for(double i:betterMagic){
			iteration++;
			if(i<min)
				min = i;
		}
		//e
		System.out.println(iteration+ ": "+ min);
	}

}
