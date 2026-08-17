package in.co.collection.SetInterface;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		
		Set set = new TreeSet();
		
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
		System.out.println(set);
		
	}

}
