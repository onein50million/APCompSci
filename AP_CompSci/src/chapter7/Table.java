package chapter7;

public class Table {

	private int[][] values;
	public Table(){
		values = new int[][]{
				{0,3,5,6},
				{1,3,4,6},
				{5,2,5,3},
				{9,3,3,2}
				};
	}
	public Table(int[][] values){
		this.values = values;
	}
	public Table(int rows, int columns){
		values = new int[rows][columns];
	}
	public void set(int i, int j, int n){
		values[i][j] = n;
	}
	public double neighbourAverage(int row, int column){
		int sum = 0;
		for(int i = -1; i < 2; i++){
			for(int j = -1; j < 2; j++){
				if(row+i >=0 && row+i <= values[0].length && column+j >= 0 && column+j <= values.length ){
					sum += values[row+i][column+j];
				}
			}
		}
		return sum/9;
	}
 	public void print(){
 		for(int[] i:values){
 			for(int j :i){
 				System.out.print(j + " ");
 			}
 			System.out.println();
 		}
 	}
}
