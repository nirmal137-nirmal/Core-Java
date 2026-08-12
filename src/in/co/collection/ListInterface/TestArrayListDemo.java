package in.co.collection.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListDemo {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add("Nirmal");
		l.add("Rupesh");
		l.add("Piyush");
		l.add("Gourav");
		l.add("Dipesh");
		
		//System.out.println(l);
		
		// Clear all Data
		l.clear();
		System.out.println(l);
		
		
	}

}
