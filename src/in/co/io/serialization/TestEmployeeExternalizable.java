package in.co.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeExternalizable {
	
	public static void main(String[] args) throws Exception {
		
		Employee e = new Employee(1, "Ram");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Project-workspace\\IO-folder\\EmployeeExternalizable"));
		
		out.writeObject(e);
		
		out.close();
		
		System.out.println("Object Serialized Successfully");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Project-workspace\\IO-folder\\EmployeeExternalizable"));
		
		System.out.println(in.readObject());
		
		in.close();
	}

}
