package chapter9;

public class Daily extends Appointment {
	
	public Daily(String descriptor) {
		super(new int[] {0,0,0},descriptor);
	}

	public boolean sameDay(int[] date){
		return true;

	}
	
}
