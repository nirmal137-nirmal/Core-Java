package in.co.io;

import java.io.File;
import java.util.Date;


public class FileInfo {
	
	public static void main(String[] args) {
		
		// Create object of "fileInfo.text" file
		
		File f = new File("C:\\Project-workspace\\IO-folder\\fileInfo.txt");
		
		//check if file exists
		
		if(f.exists()) {
		
		//Name of file
		
		System.out.println("Name : " + f.getName());
		
		//Path of file
		
		System.out.println("Path : " + f.getAbsolutePath());
		
		//check access permission
		
		System.out.println("Access permission");
		System.out.println("Writable : " +f.canWrite());
		System.out.println("Readble : " +f.canRead());
		
		//Check if it is a directory or a file
		
		System.out.println("Is file : " +f.isFile());
		//System.out.println("Is Dir : " f.isDirectory()); 
		
		//Last Modified date if file/directory
		Date d = new Date(f.lastModified());
		
		System.out.println("Date Modified : " + d);
		
		//length of file
		
		long length = f.length();
		System.out.println("Length : " + length + "bytes");
		
		}else {
			System.out.println("File does not exits");
		}

	}

}
