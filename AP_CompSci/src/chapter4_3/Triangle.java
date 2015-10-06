package chapter4_3;

public class Triangle {

	double[] points = new double[6];

	public Triangle(double x1, double y1, double x2, double y2, double x3,
			double y3) {

		points[0] = x1;
		points[1] = y1;
		points[2] = x2;
		points[3] = y2;
		points[4] = x3;
		points[5] = y3;

	}

	public double getSideLength(int point1, int point2) {

		double dx = points[point1 * 2] - points[point2 * 2];
		double dy = points[point1 * 2 + 1] - points[point2 * 2 + 1];
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

	}

	public double getPerimeter() {

		return getSideLength(0, 1) + getSideLength(1, 2) + getSideLength(2, 0);

	}

	public String prettyPrint() {

		return String.format("Points: (%.2f, %.2f), (%.2f, %.2f), (%.2f, %.2f)"
				+ "\nPerimeter: %.2f" + "\nSide Lengths: %.2f, %.2f, %.2f",
				points[0], points[1], points[2], points[3], points[4],
				points[5], getPerimeter(), getSideLength(0, 1),
				getSideLength(1, 2), getSideLength(2, 0));
	}

}
