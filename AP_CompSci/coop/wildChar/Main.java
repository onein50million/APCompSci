package wildChar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<String> lines =  new ArrayList<String>();
		while(true){
			String line = scanner.nextLine();
			if(line.equals(""))
				break;
			
			lines.add(line);
		}
		String source =  lines.get(0);
		
		for(int i = 1; i< lines.size();i++){
			Pattern pattern = Pattern.compile(toRegex(lines.get(i)));
//			System.out.println(toRegex(lines.get(i)));
			Matcher matcher =  pattern.matcher(source);
			List<Integer> indexes = new ArrayList<Integer>();
			while(matcher.find()){
				indexes.add(new Integer(matcher.start()));
			}
			System.out.println(indexes);
		}
		
	}
	
	private static String toRegex(String input){
		String output = "";
		char[] charInput =  input.toCharArray();
		for(char character : charInput){
			if(character == '#'){
				output += "[aeiou]";
			}
			else if(character == '@'){
				output += "[a-z&&[^aeiuo]]";
			}
			else if(character == '&'){
				output += "[a-z]";
			}
			else if(character == '*'){
				output += " ";
			}
			else{
				output += character;
			}
		}
		return output;
	}

}
