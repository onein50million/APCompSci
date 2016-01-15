package chapter7;

public class Chapter7_4 {

	public static void main(String[] args) {
		Table table = new Table(new int[][]
				{
				{16, 3, 2, 13},
				{5, 10, 11, 8},
				{9, 6, 7, 12},
				{4, 15, 14, 1},
			});
		System.out.println(table.neighbourAverage(0, 1));
		table.print();

	}

}
