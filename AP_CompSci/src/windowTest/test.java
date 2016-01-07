import java.math.BigInteger;
import java.util.Scanner;



public class test {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Number: ");
		BigInteger num = scan.nextBigInteger();
		
		BigInteger first = (new BigInteger("2")).modPow(num.subtract(BigInteger.ONE), num);
		BigInteger second = fib(num.add(BigInteger.ONE)).mod(num);
				
		boolean prime = first.equals(BigInteger.ONE) && second.equals(BigInteger.ONE);
		if(prime){
			System.out.println(num + " is prime");
		}
		else{
			System.out.println(num + " is not prime");
		}

	}
	
	static public BigInteger fib(BigInteger n){
		
		BigInteger seed1 = new BigInteger("0");
		BigInteger seed2 = new BigInteger("1");
		
		for(BigInteger i = new BigInteger("0"); i.compareTo(n.divide(new BigInteger("2"))) < 0; i = i.add(BigInteger.ONE)){
			
			seed2 = seed2.add(seed1);
			seed1 = seed1.add(seed2);			
		}
		
		return seed1;
				
		
	}

}


