package in.co.collection.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListDemo {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(0, "Nirmal");
		l.add(1, "Rupesh");
		l.add(2, "Piyush");
		l.add(3, "Gourav");
		l.add(4, "Dipesh");
		
		//System.out.println(l);
		
		// Clear all Data
		/*
		 * l.clear(); System.out.println(l);
		 */
		
		//contains 
		//System.out.println(l.contains(l)); // False
		//System.out.println(l.contains("Nirmal"));
		
		// isEmpty method
		//System.out.println(l.isEmpty()); // True or false
		
		//Remove element 
		/*
		 * l.remove("Nirmal"); System.out.println(l);
		 */
		
		//System.out.println(l.size());
		
		
		// Insert Bhsushan at position of index;
		/*
		 * l.add(5, "Bhushan"); System.out.println(l);
		 */
		
		// Return the index element
		
		/*
		 * System.out.println(l); System.out.println(l.get(2));
		 */
		
		// remove 
		
		/*
		 * l.remove(2); System.out.println(l);
		 */
		
		// replace the i-th element with 0
		
		/*
		 * l.set(3, "Vishal"); System.out.println(l);
		 */
		
		
		//Search object index
		//System.out.println(l.indexOf("Gourav"));
		
		//searches object from end
		//System.out.println(l.lastIndexOf("Nirmal"));
		
		l.subList(0, 4);
		System.out.println(l.subList(0, 2));
	}

}
