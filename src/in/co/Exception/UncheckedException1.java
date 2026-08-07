package in.co.Exception;

public class UncheckedException1 {
	public static void main(String[] args) {
		try {
			dad();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void dad() {
		mom();

	}

	private static void mom() {
		son();

	}

	private static void son() {
		throw new RuntimeException("Make a mistake");

	}

}
