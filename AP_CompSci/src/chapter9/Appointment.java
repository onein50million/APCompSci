package chapter9;

public class Appointment {
	//y m d
	public int[] date;
	String descriptor;
	
	public Appointment(int[] date,String descriptor){
		this.date = date;
		this.descriptor = descriptor;
	}
	public boolean sameDay(int[] date){
		return this.date[0] == date[0] && this.date[1] == date[1] && this.date[2] == date[2];
	}

}
