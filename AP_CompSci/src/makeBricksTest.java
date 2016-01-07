
public class makeBricksTest {
	
	final static int SMALLSIZE = 1;
	final static int BIGSIZE = 5;

	public static void main(String[] args) {


	}
	
	public static boolean makeBricks(int small, int big, int goal) {
		
		if(small >= goal){
			return true;
		}
		else if(big*BIGSIZE >= goal && goal % BIGSIZE == 0){
			return true;
		}
		else if((BIGSIZE*big)%goal != 0 && BIGSIZE*big - (big>(goal/BIGSIZE)?big-goal/BIGSIZE:0)*BIGSIZE + small >= goal){
			return true;
		}
		else{
			return false;
		}

		
	}


}
