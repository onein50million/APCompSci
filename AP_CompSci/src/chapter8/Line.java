package chapter8;

public class Line {

	public class VerticalSlopeException extends Exception {

		public VerticalSlopeException(String message) {
			super(message);
		}
	}

	public class ParallelLineException extends Exception {
		public ParallelLineException(String message) {
			super(message);
		}
	}

	// Line in form ax+by=c

	private double a;
	private double b;
	private double c;

	public Line(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("new line:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static Line parseLine(String input) {
		String[] terms = input.split("(?=[\\+=-])");
		return new Line(Double.parseDouble(terms[0].replace("x", "")),
				Double.parseDouble(terms[1].replace("y", "")),
				Double.parseDouble(terms[2].replace("=", "")));
	}

	public double getSlope() throws VerticalSlopeException {
		if (isVertical()) {
			throw new VerticalSlopeException("Line has vertical slope");
		} else {
			return -a / b;
		}
	}

	public boolean isVertical() {
		return b == 0;
	}

	public boolean isHorizontal() {
		return a == 0;
	}

	public boolean equals(Line line) {
		return (a / line.a == b / line.b && b / line.b == c / line.c);
	}

	public boolean isParallel(Line line) throws VerticalSlopeException {
		return (!(isVertical() != line.isVertical()) && (getSlope() == line.getSlope())) && !equals(line);
	}

	public boolean isPerpendicular(Line line) throws VerticalSlopeException {
		System.out.println(isHorizontal() == line.isVertical());
		return (isVertical() && line.isHorizontal()) || (isHorizontal() && line.isVertical()) || (getSlope() == -1 / line.getSlope());

	}

	public double[] getIntersection(Line line) throws ParallelLineException,
			VerticalSlopeException {
		if (isParallel(line)) {
			throw new ParallelLineException("Lines are parallel");
		}
		double a1 = this.a;
		double b1 = this.b;
		double c1 = this.c;

		double a2 = line.a;
		double b2 = line.b;
		double c2 = line.c;

		// x equation: http://imgur.com/GdU3tEW.png
		double x = -(c1 * b2 - c2 * b1) / (a2 * b1 - a1 * b2);
		// y equation: http://imgur.com/AbEsXmW.png
		double y = (c1 * a2 - c2 * a1) / (b1 * a2 - b2 * a1);

		return new double[] { x, y };
	}
}
