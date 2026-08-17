package in.co.collection.SetInterface;

import java.util.HashSet;
import java.util.Set;

//1.Set contain only unique elements
//2.Set contain only one null value
//3.Order of HashSet is not define

public class TestHashSet {
	
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add(null);
		s.add(null);
		s.add('a');
		s.add('a');
		s.add("Java");
		s.add("Nirmal");
		
		System.out.println(s);
	}

}
