package chapter4_3;


import javax.swing.JOptionPane;

public class TriangleTester {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Enter points seperated by commas.\nAny non digit orther than ',.-' will be removed.");
		input = input.replaceAll("(?![,.-])\\D", "");
		String words[] = input.split(",");
		double numbers[] = new double[words.length];
		int i = 0;
		for (String s : words) {
			numbers[i] = Double.parseDouble(s);
			i++;
		}
		Triangle tri = new Triangle(numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5]);
		System.out.println(tri.prettyPrint());

	}

}
