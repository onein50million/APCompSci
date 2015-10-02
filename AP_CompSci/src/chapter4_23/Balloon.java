package chapter4_23;

/**
 * @author Daniel Wart
 *
 *	Complex balloon simulation
 */
public class Balloon {

	private double volume;

	/**
	 * constructs new balloon with volume 0
	 */
	public Balloon() {

		volume = 0;

	}

	/**
	 * @param amount amount of air to add in cm³
	 */
	public void addAir(double amount) {

		volume += amount;

	}
	
	/**
	 * @return amount of air inside balloon in cm³
	 */
	public double getVolume() {
		
		return volume;
		
	}
	/**
	 * @return surface area of balloon in cm²
	 */
	public double getSurfaceArea() {
		
		return 4d * Math.PI * Math.pow(getRadius(), 2);
		
	}
	/**
	 * @return radius of balloon in cm
	 */
	public double getRadius() {
		
		return Math.cbrt((3d/(4*Math.PI))*volume);
		
	}
}
