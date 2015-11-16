package chapter6;

import javax.swing.JOptionPane;

public class Chapter6_5 {

	public static void main(String[] args) {
		do{
		String input = JOptionPane.showInputDialog("Phone Number:").toLowerCase().replace(" ", "");
		if (input.length()>7) {
			input = input.substring(0, 7);
		}
		String output = "";
		for(int i = 0; i<input.length();i++){
			if(i == 3){
				output += "-";
			}
			char c = input.charAt(i);
			if(c == 'a' || c == 'b' || c == 'c'){
				output += "2";
			}
			else if(c == 'd' || c == 'e' || c == 'f'){
				output += "3";
			}
			else if(c == 'g' || c == 'h' || c == 'i'){
				output += "4";
			}
			else if(c == 'j' || c == 'k' || c == 'l'){
				output += "5";
			}
			else if(c == 'm' || c == 'n' || c == 'o'){
				output += "6";
			}
			else if(c == 'p' || c == 'q' || c == 'r' || c == 's'){
				output += "7";
			}
			else if(c == 't' || c == 'u' || c == 'v'){
				output += "8";
			}
			else if(c == 'w' || c == 'x' || c == 'y' || c == 'z'){
				output += "9";
			}
			
		}
		JOptionPane.showMessageDialog(null,"The number is " + output);
	}
	while(JOptionPane.showConfirmDialog(null, "Continue?", "Continue?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

	}
}
