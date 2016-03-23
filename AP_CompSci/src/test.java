public class test{

	public static void main(String[] args){
		superTest test =  new subTest();
		System.out.println(test);
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