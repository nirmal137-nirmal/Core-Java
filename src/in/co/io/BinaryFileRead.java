package in.co.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryFileRead {

	public static void main(String[] args) throws Exception {

		String source = "C:\\Project-workspace\\IO-folder\\baby.txt";
		String target = "C:\\Project-workspace\\IO-folder\\girl.txt";

		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int ch = in.read(); // Read a byte
		while (ch != -1) { // -1 if EOF
			out.write(ch); // Write a byte
			ch = in.read(); // Read a byte
		}
		
		System.out.println("Completed");
		
		
		out.close();
		in.close();

	}
}
