package in.co.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTestFile {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("C:\\Project-workspace\\IO-folder\\java.txt");
		
		file.write("Input and Output are basic concepts in programming. Input means taking data or information from the user, while Output means displaying the result on the screen. In Java, we commonly use the Scanner class to take input from the user and System.out.println() to display output. For example, a program can take a student's name and marks as input and then display the student's details as output. Input and Output help programs interact with users and perform useful tasks based on the data provided.\r\n"
				+ "");
		
		System.out.println("Test Data Write Successfully");
		
		file.close();
	}

}
