import java.text.DateFormat;
import java.util.Date;


public class DateTest {

	public static void main(String[] args) {
		
		Date now = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		
		System.out.println(df.format(now));

	}

}
