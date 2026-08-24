package in.co.io;

import java.io.FileReader;

public class TestFileReaderdemo {
	public static void main(String[] args) throws Exception {

		// Open a file

		FileReader reader = new FileReader("C:\\Project-workspace\\IO-folder\\file.txt");

		// Read a char as Ascii or uniCode

		int ch = reader.read();
		char chr;

		// ch is -1 if no more char is left in file

		while (ch != -1) {
			chr = (char) ch;
			System.out.println(ch + " = " + chr);
			ch = reader.read();
		}
		reader.close();

	}

}

