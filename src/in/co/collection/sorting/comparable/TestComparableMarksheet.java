package in.co.collection.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparableMarksheet {
	
	public static void main(String[] args) {
		
		ArrayList<Marksheet> list = new ArrayList<Marksheet>();
		
		list.add(new Marksheet("101", "Nirmal", 45));
		list.add(new Marksheet("102", "Abhishek", 70));
		list.add(new Marksheet("103", "Nayan", 62));
		list.add(new Marksheet("102", "Dipesh", 33));
		list.add(new Marksheet("104", "Bhushan", 78));
		list.add(new Marksheet("106", "Harshal", 23));
		
		list.forEach(System.out::println);
		
		System.out.println("------------Sorted Marksheet-----------");
		
		Collections.sort(list);
		
		list.forEach(System.out::println);
	}

}
