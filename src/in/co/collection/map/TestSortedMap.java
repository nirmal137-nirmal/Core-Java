package in.co.collection.map;

import java.util.SortedMap;
import java.util.TreeMap;

//SortedMap order map in asc order

public class TestSortedMap {
	public static void main(String[] args) {
		
		SortedMap m = new TreeMap();
		
		m.put(101, "Nirmal");
		m.put(102, "Bhushan");
		m.put(103, "Abhishek");
		m.put(104, "Piyush");
		
		System.out.println(m);
		
		System.out.println(m.firstKey());
		
		System.out.println(m.lastKey());
		
		System.out.println(m.headMap(103));
		
		System.out.println(m.tailMap(103));
		
		System.out.println(m.subMap(101, 105));
		
		
	}

}
