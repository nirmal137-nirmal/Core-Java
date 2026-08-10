package in.co.corejava.Exception;

public class MultipleExceptionHandling {
	public static void main(String[] args) {

		String name = "Nirmal";

		try {
			// Get The length of String
			System.out.println(name.length());

			// Get 7th character of String
			System.out.println(name.charAt(6));
		} catch (NullPointerException e) {
			// Executed when name is null
			System.out.println("Name can't be null");
		} catch (StringIndexOutOfBoundsException e) {
			// Executed when String length is less than 7 chars
			System.out.println("String is small");
		}

	}
}
