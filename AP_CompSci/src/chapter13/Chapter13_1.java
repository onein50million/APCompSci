package chapter13;

public class Chapter13_1 {

	public static void main(String[] args) {

		System.out.println(new Pattern(7));
		System.out.println(new Reverse("Hello"));
		System.out.println(new Exponentation(2,5).calculate());

	}

}

class Pattern {

	private int width;

	public Pattern(int width) {

		this.width = width;

	}

	private String line() {
		if(width ==1){
			return "*";
		}
		
		return "*" + new Pattern(width-1).line();
		
	}

	public String toString() {
		if (width == 1) {
			return "*\n";
		}
//		String outside = new String(new char[width]).replaceAll(".", "*");
		String outside = line();
		return outside + "\n" + new Pattern(width - 1) + outside + "\n";

	}

}

class Reverse{
	private String string;
	public Reverse(String string){
		this.string = string;
	}
	public String toString(){
		
		if(string.length() == 1){
			return string;
		}
		return string.substring(string.length()-1,string.length()) + new Reverse(string.substring(0, string.length()-1));
		
	}	
}

class Exponentation{
	private int base;
	private int exponent;
	public Exponentation(int base, int exponent){
		this.base = base;
		this.exponent = exponent;
	}
	
	public int calculate(){
		if(exponent == 1){
			return base;
		}
		return new Exponentation(base, exponent-1).calculate()*base;
	}
}

