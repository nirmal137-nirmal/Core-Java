package in.co.corejava.practice;

public class TestPrintTable02 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) { // rows

			for (int j = 1; j <= 10; j++) { // columns

				System.out.print(i * j + "\t");

			}

			System.out.println();
			System.out.println();
		}

	}
}
