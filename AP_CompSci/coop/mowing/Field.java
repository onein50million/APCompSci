package mowing;

import java.util.ArrayList;
import java.util.List;

public class Field {

	private int[][] field;
	static final int GRASS = 0;
	static final int TREE = 1;

	// True for tree, false if grass

	public Field(int[][] array) {
		this.field = array;
	}

	public int get(int row, int column) {
		return this.field[row][column];
	}

	public String toString() {
		String output = "   ";
		for(int i = 0; i < field[0].length; i++){
			output += i + ")";
		}
		output += "\n";
		for (int row = 0; row < field.length; row++) {

			output += row + ") ";
			for (int column = 0; column < field[0].length; column++) {
				output += field[row][column] + " ";
			}
			output += "\n";
		}
		return output;
	}

	public List<int[]> getNear( int r, int c){
		List<int[]> nearby = new ArrayList<int[]>(); 
		for(int row = -2; row <= 2; row++){
			for(int column = -2; column<=2; column++){
				if(column == 0 && row == 0)
					continue;
				if((row+r < 0 || row+r >= field.length) || (column+c < 0 || column+c >= field[0].length))
					continue;
				if(get(row+r,column+c)==TREE){
					nearby.add(new int[]{row+r,column+c});
				}
			}
		}
		return nearby;
	}
	public void drawConnection(int row1, int column1, int row2, int column2){
		int fill = 2;
		for(int column = Math.min(column1, column2); column <= Math.max(column1, column2); column += Math.abs(column1-column2)){
			for(int row = Math.min(row1, row2); row <= Math.max(row1, row2); row++){
				if(get(row,column) != GRASS){
					continue;
				}
				field[row][column] = fill;
			}
			fill++;
			if(column1-column2 == 0){
				break;
			}
		}
		fill = 2;
		for(int row = Math.min(row1, row2); row <= Math.max(row1, row2); row += Math.abs(row1-row2)){
			for(int column = Math.min(column1, column2); column <= Math.max(column1, column2); column++){
				if(get(row,column) != GRASS){
					continue;
				}
				field[row][column] = fill;

			}
			fill++;
			if(row1-row2 == 0){
				break;
			}			
		}
	}
	public void addBoundaries(){
		for(int row = 0; row < field.length; row++){
			for(int column = 0; column < field[0].length; column++){
				if(field[row][column] == TREE){
					List<int[]> nearby = getNear(row, column);
					for(int i = 0; i < nearby.size()-1; i++){
						int[] point1 = nearby.get(i);
						int[] point2 = nearby.get(i+1);
						drawConnection(point1[0],point1[1],point2[0],point2[1]);
					}
				}
			}
		}
		
	}
}

// search in 5x5 grid around tree
// make boundary line (Manhattan) between trees
// fill inside