package in.co.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderFile {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("C:\\Project-workspace\\IO-folder\\bufferReader.txt");

		BufferedReader br = new BufferedReader(file);

		String line = br.readLine();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
	}

}
