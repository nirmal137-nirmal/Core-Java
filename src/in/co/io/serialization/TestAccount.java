package in.co.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccount {

	public static void main(String[] args) throws Exception {

		Account a1 = new Account(5000, 54878754, 1234);

		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("C:\\Project-workspace\\IO-folder\\account.txt")); // open file

		out.writeObject(a1); // write object into file

		out.close(); // then close the file

		System.out.println("object serialized successfully");

		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("C:\\Project-workspace\\IO-folder\\account.txt"));

		System.out.println(in.readObject());

	}

}
