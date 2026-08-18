package in.co.collection.iteratorAndEnumeration;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(0, "Nirmal");
		v.add(1, 'a');
		v.add(2, 45);
		v.add(3, "Vinay");
		v.add(4, "Ajay");
		
		
		System.out.println(v);
		
		System.out.println("-------Enumeration---------------");
		
		Enumeration e = v.elements();
		
		v.add(5, "Abhishek");  // fail Safe 
		
		while(e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
			
		}
		System.out.println( "=============================================");
		
		System.out.println("Vector :" + v);
	}
}
