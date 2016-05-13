package mowing;

import java.util.List;

public class Test {

	public static void main(String[] args) {

		Field field = new Field(new int[][]{
				{0,0,0,0,0},
				{0,0,0,0,1},
				{0,0,1,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,0,1,0}
		});
		field.addBoundaries();
		System.out.println(field);
		
		
	}
}
