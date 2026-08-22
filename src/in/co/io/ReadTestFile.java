package in.co.io;

import java.io.FileReader;

public class ReadTestFile {
	public static void main(String[] args) throws Exception {
		
		//Read single character only as int
		FileReader file = new FileReader("C:\\Project-workspace\\IO-folder\\nirmal.txt");
		
		int i = file.read();
		
		while(i != -1) {
			System.out.println((char) i + " = " +i);
			i = file.read();
			
		}
		file.close();
	}

}
