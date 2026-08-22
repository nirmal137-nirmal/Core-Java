package in.co.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferWrite {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter  file = new BufferedWriter(new FileWriter("C:\\Project-workspace\\IO-folder\\bufferWrite.txt"));
		
		file.write("class Nirmal { ");
		file.newLine();
		file.write("public static void main(String args[]) { ");
		file.newLine();
		file.write("System.out.println(\"Hello world\"); ");
		file.newLine();
		file.write(" } " + "\n" + "}");
		
		System.out.println("Java file Write Successfully");
		
		file.close();
	}

}
