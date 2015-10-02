package chapter4_23;

public class BalloonTester {

	public static void main(String[] args) {

		Balloon baalon = new Balloon();
		baalon.addAir(100);
		System.out.printf("Volume: %.2f cm³\nSurface Area: %.2f cm²\nRadius: %.2f cm\n",baalon.getVolume(),baalon.getSurfaceArea(),baalon.getRadius());
		
		System.out.println("\n100cm³ more air\n");
		
		baalon.addAir(100);
		System.out.printf("Volume: %.2f cm³\nSurface Area: %.2f cm²\nRadius: %.2f cm\n",baalon.getVolume(),baalon.getSurfaceArea(),baalon.getRadius());

	}

}
