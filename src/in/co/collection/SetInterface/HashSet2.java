package in.co.collection.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSet2 {
	
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add("Ravi");
		s.add("Ajay");
		s.add("vinay");
		s.add("Ravi");
		
		System.out.println(s);
	}

}
