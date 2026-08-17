package in.co.collection.SetInterface;

import java.util.SortedSet;
import java.util.TreeSet;

//SortedSet is order set in asc
//does not contain null value
//does not contain duplicate value

public class TestSortedSet {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add("Nirmal");
		s.add("Abhishek");
		s.add("Gourav");

		System.out.println(s);

		// Remove element
		s.remove("Gourav");
		System.out.println(s);
	}

}
