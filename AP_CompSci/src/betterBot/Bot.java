package betterBot;

import java.util.HashMap;
import java.util.Map;

public class Bot {

	private String[][] stringResponses = {
			{"test 1", "test2"}
			,{"test 3", "test 4"}
			};
	
	public Map<String, String> responses = new HashMap<String,String>();
	
	public static void main(String[] args) {

		Bot bot = new Bot();

	}

	public Bot(){

		for (String[] strings : stringResponses) {
			
			responses.put(strings[0], strings[1]);
			
		}

		
		
	}
	
}
