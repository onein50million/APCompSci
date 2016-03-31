package chapter13;

public class Chapter13_34 {

	public static void main(String[] args) {
		
		System.out.println(new GCD(100,1000).calculate());
		System.out.println(new Multiplication(100, 100).calculate());

	}

}

class GCD{
	
	private int x;
	private int y;
	
	public GCD(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int calculate(){
		if(y == 0){
			return x;
		}
		return new GCD(y,x%y).calculate();
	}
	
}

class Multiplication{
	
	private int a;
	private int b;
	public Multiplication(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int calculate(){
		if(this.a == 1){
			return this.b;
		}
		if(this.b == 1){
			return this.a;
		}
		return new Multiplication(this.a, this.b-1).calculate() + this.a;
		
	}
	
	
}
