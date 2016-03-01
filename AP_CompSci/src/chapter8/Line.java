
package chapter8;

public class Line {
	
	public double a;
	public double b;
	public double c;

	public Line(double a, double b, double c) throws Exception{
		if(a==0&&b==0){
			throw new Exception("Not a line");
		}
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean isVertical(){
		return b==0;
	}
	public boolean isHorizontal(){
		return a==0;
	}
	public boolean equals(Line line){
		return a/line.a == b/line.b && b/line.b == c/line.c;
	}
	public double getSlope(){
		if(b != 0){
			return -a/b;
		}
		return Double.NaN;
	}
	public boolean isParallel(Line line){
		if(!equals(line)){
			return (isVertical() && line.isHorizontal()) ||
			(isHorizontal() && line.isVertical()) ||
			(getSlope() == line.getSlope());
		}
		return false;
	}
	public boolean isPerpendicular(Line line){
		return (isVertical() && !line.isHorizontal()) ||
		(isHorizontal() && !line.isVertical()) ||
		(getSlope() != line.getSlope());
	}
	public double[] getIntersect(Line line){
		double a1 = a;
		double b1 = b;
		double c1 = c;
		
		double a2 = line.a;
		double b2 = line.b;
		double c2 = line.c;
		
		double x = (b1*c2-b2*c1)/
				(a2*b1-a1*b2);
		double y = (a2*c1-a1*c2)/
				(a2*b1-a1*b2);
		
		return new double[]{x,y};


	}
	
}
