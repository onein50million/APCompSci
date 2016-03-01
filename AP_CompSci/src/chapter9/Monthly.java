package chapter9;

public class Monthly extends Appointment {

	public Monthly(int day,String descriptor) {
		super(new int[] {0,0,day},descriptor);
	}

	public boolean sameDay(int[] date){
		return  this.date[2] == date[2];
	}

	
}
