package chapter4;

import javax.swing.JOptionPane;

public class Chapter4_12 {

	static final double a = 17.27;
	static final double b = 237.7;
	
	public static void main(String[] args) {
		
		double temperature = Double.parseDouble(JOptionPane.showInputDialog("Please enter the actual temperature"));
		double relativeHumidity = Double.parseDouble(JOptionPane.showInputDialog("Please enter the relative humidity"));
		double dewPoint;
		
		dewPoint = (b*f(temperature,relativeHumidity))/(a-f(temperature,relativeHumidity));
		System.out.printf("The dew point when the temperature is %.2f° Celsius and the relative humidity is %.2f%% is %.2f° Celsius.",temperature,relativeHumidity*100,dewPoint);
		
	}
	
	private static double f(double T, double RH) {
		
		return (a*T)/(b+T) + Math.log(RH);
		
	}
	
}
