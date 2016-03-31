import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class test{

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(new File("P74207281.txt")));
//		String strNum = new String(new char[Integer.MAX_VALUE/8]).replaceAll(".", "9");
		String strNum = reader.readLine();
		BigInteger number = new BigInteger(strNum);
		System.out.println("test");
		System.out.println(new sumDigits().sumDigits(number));
	}
	
}


class superTest{
	protected String variable = "5";
	public void testMeth(){
		System.out.println("super");
	}

}

class subTest extends superTest{

	public void testMeth(){
		System.out.println("sub");
	}
	
	public String toString(){
		return variable;
	}
	
}

class sumDigits{
	
	public BigInteger sumDigits(BigInteger number){
		if(number.divide(BigInteger.TEN) == BigInteger.ZERO){
			return number;
		}
		return sumDigits(number.divide(BigInteger.TEN)).add(number.mod(BigInteger.TEN));
		
	}
	
}