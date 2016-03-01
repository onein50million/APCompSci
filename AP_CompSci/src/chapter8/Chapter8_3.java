package chapter8;

public class Chapter8_3 {

	public static void main(String[] args) throws Exception {

		Line[] lines = new Line[] { new Line(2, 3, 4), new Line(3, 5, 7), new Line(2, 3, -2), new Line(3, -2, 1),
				new Line(2, 0, 3), new Line(0, -1, 2), new Line(4, 6, 8),

		};
		int iCount = 1;
		int jCount = 1;
		for (Line i : lines) {
			
			System.out.printf("Line %d:\n", iCount);
			if (!i.isVertical() && !i.isHorizontal()) {
				System.out.printf("The slope is %.2f\n", i.getSlope());
			} else if (i.isVertical()) {
				System.out.printf("%.2fx + %.2fy = %.2f is vertical\n", i.a, i.b, i.c);
			} else {
				System.out.printf("%.2fx + %.2fy = %.2f is horizontal\n", i.a, i.b, i.c);
			}
			for (Line j : lines) {
				if (i.isParallel(j) || i.isPerpendicular(j) || (!i.isParallel(j) && !i.equals(j) || i.equals(j))) {
					System.out.printf("Line %d and line %d:\n", iCount, jCount);
				}
				if (i.isParallel(j)) {
					System.out.printf("%.2fx + %.2fy = %.2f and %.2fx + %.2fy = %.2f are parallel\n", i.a, i.b, i.c,
							j.a, j.b, j.c);
				} else if (i.isPerpendicular(j)) {
					System.out.printf("%.2fx + %.2fy = %.2f and %.2fx + %.2fy = %.2f are perpendicular\n", i.a, i.b,
							i.c, j.a, j.b, j.c);
				}
				if(i.equals(j)){
					System.out.printf("%.2fx + %.2fy = %.2f and %.2fx + %.2fy = %.2f are equal\n", i.a, i.b,
							i.c, j.a, j.b, j.c);
				}
				if (!i.isParallel(j) && !i.equals(j)) {
					double[] point = i.getIntersect(j);
					System.out.printf("%.2fx + %.2fy = %.2f intersects with %.2fx + %.2fy = %.2f at (%.2f, %.2f)\n",
							i.a, i.b, i.c, j.a, j.b, j.c, point[0], point[1]);
				}
			jCount++;
			}
			iCount++;
			jCount = 1;
			System.out.println("");

		}

	}
	// private static void testLines(Line line1, Line line2){
	// System.out.printf("%.2fx + %.2fy = %.2f compared to %.2fx + %.2fy = %.2f
	// \n",line1.a,line1.b,line1.c,line2.a,line2.b,line2.c);
	// if(!line1.isVertical()||!line1.isHorizontal()){
	// System.out.printf("The slope is %.2f\n",line1.getSlope());
	// }
	// else if(line1.isVertical()){
	// System.out.printf("%.2fx + %.2fy = %.2f is
	// vertical\n",line1.a,line1.b,line1.c);
	// }
	// else{
	// System.out.printf("%.2fx + %.2fy = %.2f is
	// horizontal\n",line1.a,line1.b,line1.c);
	// }
	// if(line1.isParallel(line2)){
	// System.out.printf("%.2fx + %.2fy = %.2f and %.2fx + %.2fy = %.2f are
	// parallel\n",line1.a,line1.b,line1.c,line2.a,line2.b,line2.c);
	// }
	// else if(line1.isPerpendicular(line2)){
	// System.out.printf("%.2fx + %.2fy = %.2f and %.2fx + %.2fy = %.2f are
	// perpendicular\n",line1.a,line1.b,line1.c,line2.a,line2.b,line2.c);
	// }
	// if(!line1.isParallel(line2)){
	// double[] point = line1.getIntersect(line2);
	// System.out.printf("%.2fx + %.2fy = %.2f intersects with %.2fx + %.2fy =
	// %.2f at (%.2f,
	// %.2f)\n",line1.a,line1.b,line1.c,line2.a,line2.b,line2.c,point[0],point[1]);
	// }
	// }

}

