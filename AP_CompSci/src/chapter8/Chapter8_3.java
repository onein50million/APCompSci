package chapter8;

import chapter8.Line.ParallelLineException;
import chapter8.Line.VerticalSlopeException;

public class Chapter8_3 {

	public static void main(String[] args) throws Exception {

		Line[] lines = new Line[] { Line.parseLine("1x+0y=4"),
				Line.parseLine("3x+5y=7") };
		testLines(lines[0],lines[1]);
		
	}

	public static void testLines(Line line1, Line line2)
			throws ParallelLineException, VerticalSlopeException {
		
		if(!line1.isVertical()){
			System.out.println("Line slope: " + line1.getSlope());
		}
		if(line1.equals(line2)){
			System.out.println("Lines are equal");
		}
		if(line1.isParallel(line2)){
			System.out.println("Lines are parallel");
		} 
		if(line1.isPerpendicular(line2)){
			System.out.println("Lines are peprendicular");
		}
		if(line1.isHorizontal()){
			System.out.println("Line is horizontal");
		}
		if(line1.isVertical()){
			System.out.println("Line is vertical");
		}
		if (!line1.isParallel(line2)) {
			double[] intersect = line1.getIntersection(line2);
			System.out.println("Lines intersection: x = " + intersect[0] + " y = " + intersect[1]);
		}
	}

}
