package in.co.corejava.practice;

public class TestPrintTable03 {

	public static void main(String[] args) {

		int[][] table = new int[10][10];

		for (int i = 0; i < 10; i++) { // rows

			for (int j = 0; j < 10; j++) { // columns

				table[i][j] = (i + 1) * (j + 1);

				System.out.print(table[i][j] + "\t");

			}

			System.out.println();
			System.out.println();
		}

	}
}
