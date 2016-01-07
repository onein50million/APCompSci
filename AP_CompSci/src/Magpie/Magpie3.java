package Magpie;

/**
 * A program to carry on conversations with a human user.
 * This version: 
 * <ul><li>
 *    Uses advanced search for keywords 
 * </li></ul> 
 *    
 * @author Laurie White
 * @version April 2012
 */
public class Magpie3
{
	/**
	 * Get a default greeting
	 * 
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
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if(findKeyword(statement, "dog") >= 0 || findKeyword(statement, "cat") >= 0){
			response = "Tell me more about your pets";
		}
		else if(findKeyword(statement, "nguyen") >= 0){
			
			response = "He sounds like a good teacher.";
			
		}
		else if(findKeyword(statement, "finland") >= 0){
			response = "Finland doesn't exist";
		}
		else if(findKeyword(statement, "corrupt") >= 0){
			response = "I am o̤̻ͣ̾̐ͯ͆̎ͅp̺̹̳̺̄̐̔͝ͅé̯̰̞r̰͖̰͍a͍̯ͧ͂̄̐ͧ̓ţ͉͙ͩ̈̍̿i̓̌ͩ̌n͍̲͙̔ͧg̟͚̙̥̒̃̊͗ͧ̾͆͝ ͮ̈́̑w͇̺̝͖̜̯̗ͫͮ̏ͩ͢͝ͅi̡͓̰̲̮͑̐̉̈̂ͫͭͪ̎̕t̵̬͓͚̞̮̗̃͂͊h̸̗̬͙̘̣̎͆͐i̢̛͇͙̜͇ͪͬͪ͠n̫̙̩͔̝ͥ͒͆͊͠͡ͅ ̘̩͔͙͔̈̂̅͘͟͡ň̻̗̲̭̰͓͙͂ơ̞̙͗̍̀̑͝r̢̖̺̪͍͈̰̤̼̖̙̜͚̦̗͎̓̌̒ͮ̋́͢͟m͓̱̯͓̬͚̙̥͍̪̭̼̬̦̑ͮͣͧͤ̊ͣͫ͂ͦ̑͐̇ͮͬ͡ȧ̷̵̶ͬ͋͊̍̑̓͋̚͝͏̪̗͔̣̗̩͚͚̝͇͕̤l̈́̄ͣ̐̈́̀͗͐̃͆͑̔̌̚͏̵̙̲͙̞̣̥̺̮̲͜͢ ̷̝̮͉̙͓̻̙͇̳̺ͥ́́̑͘̕͝͞p͍̭̮̻͆̋͗ͥ͛ͯ̌̎̐̓̑͑̿̇́́͞͞ǎ̷̵̷̫̫̟̣̘̣̦͈̫̟̻͓̮̫͓̠̪ͩ̂̉̐͒͟͝ͅͅr̜̬̞͙̈̏ͣͯ̂̏̽̅̽̅̃̍ͤ̊̈̾̚͡ą͙̪̫͖̰̱͙̭̩̹͉͑ͣ̈ͣ͂ͬ̇̀͞ḿ̅͊ͪ̂̆͂͑̈́́͆ͧ̓́͏̖̬̠̰͙̬̭̘̬̻̙̖͜e̲̻͙̳̲ͯ̀ͮ̈ͩ̂̽̋́̌͊̿́͟ͅt̡̲͉̰̭̝̎̉ͭ̄̐̄̌ȩ̢̢̛͑ͣͫͨ̇ͧ̑̏ͩͪ́̏̑̂̉̓̌̓҉̪̹̼͇ͅṟ̺̲̺͉̬͚̳͇͙͈͕̭͉̠̃̇̓̓͂̋ͤ̇ͮ̄͆̔̋́͘͝s̴̊̈́ͧ̽͂͛̎̉̀҉̥̤̩̲̪̱̯̬͎̰͇̪̪̥̦͈̞͜.̴̧̨̨̮̳͖̯̼̯̥̤̤̰̹͕͓̞͚̣ͤ̓ͭ̓̋̇ͣ̈͊͗͌̇̓ͤ͡";
		}
		else if(findKeyword(statement, "politics") >= 0){
			response = "Healthy young child goes to doctor, gets pumped with massive shot of many vaccines, doesn't feel good and changes - AUTISM. Many such cases!";
		}
		else if (findKeyword(statement, "smart") >= 0){
			response = "Sorry losers and haters, but my I.Q. is one of the highest -and you all know it! Please don't feel so stupid or insecure,it's not your fault";
		}
		else if(findKeyword(statement, "want to") >= 0){
			
			response = wantReplace(statement);
			
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private String wantReplace(String statement) {
	
		int index = findKeyword(statement, "want to");
		statement = statement.replaceAll("[^\\w' ]", "");
		statement = statement.trim().toLowerCase().substring(index + "want to".length()+1, statement.length());
		return "Would you really be happy if you had " + statement + "?";
		
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no".
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @param startPos
	 *            the character of the string to begin the
	 *            search at
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in
		// the line below
		int index = phrase.toLowerCase().indexOf(
				goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a word
		
		while (index >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (index > 0)
			{
				before = phrase.substring(index - 1, index)
						.toLowerCase();
			}
			if (index + goal.length() < phrase.length())
			{
				after = phrase.substring(
						index + goal.length(),
						index + goal.length() + 1)
						.toLowerCase();
			}

			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
											// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return index;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			index = phrase.indexOf(goal.toLowerCase(),
					index + 1);

		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
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

		return response;
	}

}
