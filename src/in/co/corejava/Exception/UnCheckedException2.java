package in.co.corejava.Exception;

public class UnCheckedException2 {

	public static void main(String[] args) {
		try {
			comapany();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void comapany() {
		manager();

	}

	private static void manager() {
		employee();

	}

	private static void employee() {
		throw new RuntimeException("Go And Work ");

	}

}
