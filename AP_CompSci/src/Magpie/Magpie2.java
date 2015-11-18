package Magpie;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if(statement.trim().length()<=0){
			response = "Say something, please.";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if(statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0){
			response = "Tell me more about your pets";
		}
		else if(statement.indexOf("nguyen") >= 0){
			
			response = "He sounds like a good teacher.";
			
		}
		else if(statement.indexOf("finland") >= 0){
			response = "Finland doesn't exist";
		}
		else if(statement.indexOf("corrupt") >= 0){
			response = "I am o̤̻ͣ̾̐ͯ͆̎ͅp̺̹̳̺̄̐̔͝ͅé̯̰̞r̰͖̰͍a͍̯ͧ͂̄̐ͧ̓ţ͉͙ͩ̈̍̿i̓̌ͩ̌n͍̲͙̔ͧg̟͚̙̥̒̃̊͗ͧ̾͆͝ ͮ̈́̑w͇̺̝͖̜̯̗ͫͮ̏ͩ͢͝ͅi̡͓̰̲̮͑̐̉̈̂ͫͭͪ̎̕t̵̬͓͚̞̮̗̃͂͊h̸̗̬͙̘̣̎͆͐i̢̛͇͙̜͇ͪͬͪ͠n̫̙̩͔̝ͥ͒͆͊͠͡ͅ ̘̩͔͙͔̈̂̅͘͟͡ň̻̗̲̭̰͓͙͂ơ̞̙͗̍̀̑͝r̢̖̺̪͍͈̰̤̼̖̙̜͚̦̗͎̓̌̒ͮ̋́͢͟m͓̱̯͓̬͚̙̥͍̪̭̼̬̦̑ͮͣͧͤ̊ͣͫ͂ͦ̑͐̇ͮͬ͡ȧ̷̵̶ͬ͋͊̍̑̓͋̚͝͏̪̗͔̣̗̩͚͚̝͇͕̤l̈́̄ͣ̐̈́̀͗͐̃͆͑̔̌̚͏̵̙̲͙̞̣̥̺̮̲͜͢ ̷̝̮͉̙͓̻̙͇̳̺ͥ́́̑͘̕͝͞p͍̭̮̻͆̋͗ͥ͛ͯ̌̎̐̓̑͑̿̇́́͞͞ǎ̷̵̷̫̫̟̣̘̣̦͈̫̟̻͓̮̫͓̠̪ͩ̂̉̐͒͟͝ͅͅr̜̬̞͙̈̏ͣͯ̂̏̽̅̽̅̃̍ͤ̊̈̾̚͡ą͙̪̫͖̰̱͙̭̩̹͉͑ͣ̈ͣ͂ͬ̇̀͞ḿ̅͊ͪ̂̆͂͑̈́́͆ͧ̓́͏̖̬̠̰͙̬̭̘̬̻̙̖͜e̲̻͙̳̲ͯ̀ͮ̈ͩ̂̽̋́̌͊̿́͟ͅt̡̲͉̰̭̝̎̉ͭ̄̐̄̌ȩ̢̢̛͑ͣͫͨ̇ͧ̑̏ͩͪ́̏̑̂̉̓̌̓҉̪̹̼͇ͅṟ̺̲̺͉̬͚̳͇͙͈͕̭͉̠̃̇̓̓͂̋ͤ̇ͮ̄͆̔̋́͘͝s̴̊̈́ͧ̽͂͛̎̉̀҉̥̤̩̲̪̱̯̬͎̰͇̪̪̥̦͈̞͜.̴̧̨̨̮̳͖̯̼̯̥̤̤̰̹͕͓̞͚̣ͤ̓ͭ̓̋̇ͣ̈͊͗͌̇̓ͤ͡";
		}
		else if(statement.indexOf("politics") >= 0){
			response = "Healthy young child goes to doctor, gets pumped with massive shot of many vaccines, doesn't feel good and changes - AUTISM. Many such cases!";
		}
		else if (statement.indexOf("smart") >= 0){
			response = "Sorry losers and haters, but my I.Q. is one of the highest -and you all know it! Please don't feel so stupid or insecure,it's not your fault";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if(whichResponse == 4){
			response = "I guess";
		}
		else if(whichResponse == 5){
			response = "Not sure";			
		}
		else if(whichResponse == 6){
			response = secret.secret;
		}

		return response;
	}
}
