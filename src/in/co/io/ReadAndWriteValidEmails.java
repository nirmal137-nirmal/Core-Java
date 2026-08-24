package in.co.io;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteValidEmails {
	
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Project-workspace\\IO-folder\\AllEmailReader.txt");
		FileWriter file2 = new FileWriter("C:\\Project-workspace\\IO-folder\\AllEmailWriter.txt");
		
		BufferedReader br = new BufferedReader(file);
		BufferedWriter bw = new BufferedWriter(file2);
		
		String email = br.readLine();
		
		while(email != null) {
			if(email.endsWith("@gmail.com")) {
				System.out.println(email);
				bw.write(email);
				bw.newLine();
			}
			email = br.readLine();
		}
		
		br.close();
		bw.close();
	}

}
