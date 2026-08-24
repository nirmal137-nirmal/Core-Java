package in.co.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestEmailFileReader {

	public static void main(String[] args) throws Exception {

		BufferedReader file = new BufferedReader(new FileReader("C:\\Project-workspace\\IO-folder\\email.txt"));

		String email = file.readLine();

		while (email != null) {

			if (email.endsWith("@gmail.com")) {
				System.out.println(email);
			}
			email = file.readLine();
		}

		file.close();
	}

}
