package chapter7;

public class Chapter7_1 {

	public static void main(String[] args) {
		//a
		System.out.println("a).");
		double[] magic =  {8, 4, 5, 21, 7, 9, 18, 2, 100};
		//b
		System.out.println("b).");
		System.out.println(magic.length);
		//c
		System.out.println("c).");
		System.out.println(magic[0]);
		//d
		System.out.println("d).");
		System.out.println(magic[magic.length-1]);
		//e
		System.out.println("e).");
		System.out.println(magic[magic.length-1]);
		//f
		System.out.println("f).");
		for(int i = 0; i<magic.length;i++){
			System.out.println(magic[i]);
		}
		//g
		System.out.println("g).");
		for(int i = 0; i<magic.length;i++){
			System.out.println(i + ": " + magic[i]);
		}
		//h
		System.out.println("h).");
		for(int i = magic.length-1; i>=0; i--){
			System.out.println(i + ": " + magic[i]);
		}
		//i
		System.out.println("i).");
		for(double value: magic){
			System.out.println(value);			
		}
	}

}
